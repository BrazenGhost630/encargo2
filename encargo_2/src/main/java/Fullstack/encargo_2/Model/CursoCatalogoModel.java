package Fullstack.encargo_2.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;




@Entity
@Table(name = "curso_catalogo")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class CursoCatalogoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nombre;

    @Column(length = 500)
    private String descripcion;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false)
    private Integer duracionHoras;

    @Column(nullable = false)
    private Boolean activo;
    
}
