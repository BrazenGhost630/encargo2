package Fullstack.encargo_2.Model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "backup")
public class BackupModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Identificador único para el respaldo

    @Column(name = "Nombre Respaldo", nullable = false)
    private String nombre;

    @Column(name = "fecha_respaldo", nullable = false)
    private LocalDateTime fechaRespaldo;  // Fecha y hora del respaldo

    @Column(name = "estado", nullable = false)
    private String estado;  // Estado del respaldo (por ejemplo: "EXITO", "FALLO", "PENDIENTE")

    @Column(name = "datos_respaldo", columnDefinition = "TEXT")
    private String datosRespaldo;  // Los datos del curso respaldados (puede ser JSON o datos serializados)

}
