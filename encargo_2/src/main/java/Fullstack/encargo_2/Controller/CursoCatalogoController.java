package Fullstack.encargo_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fullstack.encargo_2.Model.CursoCatalogoModel;
import Fullstack.encargo_2.Services.CursoCatalogoServices;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api/v1/curso_catalogo")

public class CursoCatalogoController {

    @Autowired
    private CursoCatalogoServices catalogoServices;

    @GetMapping
    public ResponseEntity<List<CursoCatalogoModel>> listar (){
        List<CursoCatalogoModel> cursoCatalogoModel = catalogoServices.findAll();
        if (cursoCatalogoModel.isEmpty()){
           
            return ResponseEntity.noContent().build();
           
        }
        
        return ResponseEntity.ok(cursoCatalogoModel);
        
    }
    

    @PostMapping
    public ResponseEntity<CursoCatalogoModel> guardar  (@RequestBody CursoCatalogoModel cursoCatalogoModel) {
        CursoCatalogoModel catalogonuevo = catalogoServices.save(cursoCatalogoModel);

        
        return ResponseEntity.status(HttpStatus.CREATED).body(catalogonuevo);
    }


    @PutMapping("/{id}")
    public ResponseEntity<CursoCatalogoModel> actualizar (@PathVariable Long id, @RequestBody CursoCatalogoModel cursoCatalogoModel) {
        
        try{
            CursoCatalogoModel cc = catalogoServices.findById(id);
            cc.setId(id);
            cc.setNombre(cursoCatalogoModel.getNombre());
            cc.setDescripcion(cursoCatalogoModel.getDescripcion());
            cc.setCategoria(cursoCatalogoModel.getCategoria());
            cc.setDuracionHoras(cursoCatalogoModel.getDuracionHoras());
            cc.setActivo(cursoCatalogoModel.getActivo());

            catalogoServices.save(cc);

            return ResponseEntity.ok(cursoCatalogoModel);

        }
        catch(Exception e){
        return ResponseEntity.notFound().build();
        }
    }

   

    
    

    
}
