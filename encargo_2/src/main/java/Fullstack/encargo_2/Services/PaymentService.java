package Fullstack.encargo_2.Services;

import org.springframework.stereotype.Service;

import Fullstack.encargo_2.Model.TransaccionReq;
import Fullstack.encargo_2.Model.TransaccionRes;



@Service
public interface PaymentService {
    TransaccionRes iniciarPago(TransaccionReq request);
}
