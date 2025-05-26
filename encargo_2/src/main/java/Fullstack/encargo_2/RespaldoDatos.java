package Fullstack.encargo_2;

import java.util.List;

import Fullstack.encargo_2.Model.CursoCatalogoModel;
import Fullstack.encargo_2.Model.Usuario;

import lombok.Data;


@Data
public class RespaldoDatos {
    private List<CursoCatalogoModel> cursos;
    private List<Usuario> usuarios;

    public RespaldoDatos(List<CursoCatalogoModel> cursos, List<Usuario> usuarios) {
        this.cursos = cursos;
        this.usuarios = usuarios;
    }

    
}

