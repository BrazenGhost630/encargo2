package Fullstack.encargo_2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fullstack.encargo_2.Model.CursoCatalogoModel;
import Fullstack.encargo_2.Services.CursoCatalogoServices;
import org.springframework.web.bind.annotation.GetMapping;



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
    
    

    
}
