package Fullstack.encargo_2.Services;

import org.springframework.stereotype.Service;

import Fullstack.encargo_2.Model.TransaccionReq;
import Fullstack.encargo_2.Model.TransaccionRes;



@Service
public class PayPalService implements PaymentService{
    @Override
    public TransaccionRes iniciarPago(TransaccionReq request) {
        TransaccionRes resp = new TransaccionRes();
        resp.setUrl("https://paypal.com/checkout");
        resp.setToken("token456-paypal");
        return resp;
    }
}
