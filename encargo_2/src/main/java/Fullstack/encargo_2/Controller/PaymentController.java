package Fullstack.encargo_2.Controller;
import java.time.Instant;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fullstack.encargo_2.Model.Transaccion;
import Fullstack.encargo_2.Model.TransaccionReq;
import Fullstack.encargo_2.Model.TransaccionRes;
import Fullstack.encargo_2.Repository.PaymentRepository;
import Fullstack.encargo_2.Services.PaymentService;
import Fullstack.encargo_2.Services.ServiceFactory;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/pago")
@AllArgsConstructor
public class PaymentController {
    private final ServiceFactory serviceFactory;
    private final PaymentRepository paymentRepository;

    @PostMapping("/iniciar")
    public ResponseEntity<TransaccionRes> iniciarPago(@RequestBody TransaccionReq request) {
        //////////
        long start = System.currentTimeMillis();
        //////////
        
        PaymentService service = serviceFactory.getService(request.getMetodoPago());

        //////////////
        long afterServiceGet = System.currentTimeMillis();
        System.out.println("Tiempo para obtener servicio: " + (afterServiceGet - start) + "ms");
        //////////////

        TransaccionRes response = service.iniciarPago(request);
        
        ////////////////////
        long afterIniciarPago = System.currentTimeMillis();
        System.out.println("Tiempo para iniciar pago: " + (afterIniciarPago - afterServiceGet) + "ms");
        ////////////////////

        Transaccion trans = new Transaccion();
        trans.setMetodoPago(request.getMetodoPago());
        trans.setMonto(request.getMonto());
        trans.setToken(response.getToken());
        trans.setEstado("Iniciada");
        trans.setFecha(Instant.now());
        paymentRepository.save(trans);

        ////////////////////
        long afterSave = System.currentTimeMillis();
        System.out.println("Tiempo para guardar transacción: " + (afterSave - afterIniciarPago) + "ms");
        //////////////////// 

        return ResponseEntity.ok(response);
    }
}
