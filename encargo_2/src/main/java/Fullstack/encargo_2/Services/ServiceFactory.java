package Fullstack.encargo_2.Services;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Component
public class ServiceFactory {
    private final WebPayService webPayService;
    private final PayPalService payPalService;

    public PaymentService getService(String metodo) {
        return switch (metodo.toLowerCase()) {
            case "webpay" -> webPayService;
            case "paypal" -> payPalService;
            default -> throw new IllegalArgumentException("Método de pago no soportado: " + metodo);
        };
    }
}
