package Fullstack.encargo_2.Model;
import java.time.Instant;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TRANSACCION")
@Entity
public class Transaccion {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Integer id;
    @Column(nullable = false) private Integer monto; 
    @Column(nullable = false) private String metodoPago;
    @Column(nullable = false) private String token;
    @Column(nullable = false) private String estado;
    @Column(nullable = false) private Instant fecha;

    
}
