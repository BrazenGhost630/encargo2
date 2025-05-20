package Fullstack.encargo_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fullstack.encargo_2.Model.CursoCatalogoModel;

import java.util.List;

@Repository
public interface CursoCatalogoRepository extends JpaRepository<CursoCatalogoModel, Long> {
    
    
    List<CursoCatalogoModel> findByNombreIgnoreCase(String nombre);

    
    List<CursoCatalogoModel> findByCategoria(String categoria);

    
    List<CursoCatalogoModel> findByActivoTrue();

}

