package Fullstack.encargo_2.Services;

import java.util.Optional;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Fullstack.encargo_2.Model.Usuario;
import Fullstack.encargo_2.Repository.UsuarioRepository;

import java.util.List;

@Service
@Transactional
public class UsuarioService {


    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario>findAll(){return usuarioRepository.findAll();}

    public Usuario findById(long id ){
        return usuarioRepository.findById(id).get();
    }

    public Usuario save(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public void delete(Long id){
        usuarioRepository.deleteById(id);
    }

    public boolean iniciarSesion(String nombre, String contrasena) {
       Optional<Usuario> usuario = usuarioRepository.findByNombreAndContrasena(nombre, contrasena);
        return usuario.isPresent();
    }

}
