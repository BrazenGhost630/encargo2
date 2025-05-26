package Fullstack.encargo_2.Services;

import org.springframework.stereotype.Service;

import Fullstack.encargo_2.Model.TransaccionReq;
import Fullstack.encargo_2.Model.TransaccionRes;



@Service
public class WebPayService implements PaymentService{
    @Override
    public TransaccionRes iniciarPago(TransaccionReq request) {
        TransaccionRes resp = new TransaccionRes();
        resp.setUrl("https://webpay.cl/pago");
        resp.setToken("token123-webpay");
        return resp;
    }
}
