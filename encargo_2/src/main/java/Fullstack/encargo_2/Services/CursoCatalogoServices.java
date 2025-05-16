package Fullstack.encargo_2.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Fullstack.encargo_2.Model.CursoCatalogoModel;
import Fullstack.encargo_2.Repository.CursoCatalogoRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CursoCatalogoServices {
    @Autowired 
    private CursoCatalogoRepository catalogoRepository;

    public List<CursoCatalogoModel> findAll(){
        return catalogoRepository.findAll();

    }
    public CursoCatalogoModel findById(long id){

        return catalogoRepository.findById(id).get();
    }
    public CursoCatalogoModel save (CursoCatalogoModel catalogoModel){
        return catalogoRepository.save(catalogoModel);

    }

    public void delete(Long id){
        catalogoRepository.deleteById(id);
    }
    public CursoCatalogoModel findbycategoria(String categoria){
        return catalogoRepository.findByCategoria(categoria).get(0);
    }

    public CursoCatalogoModel findbynombre(String nombre){
        return catalogoRepository.findByNombreIgnoreCase(nombre).get(0);
    }
}
