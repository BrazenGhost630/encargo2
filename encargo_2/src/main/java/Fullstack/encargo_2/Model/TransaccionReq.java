package Fullstack.encargo_2.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransaccionReq {
    private Integer monto;
    private String metodoPago;
}
