package Fullstack.encargo_2.Model;

import java.util.List;


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

