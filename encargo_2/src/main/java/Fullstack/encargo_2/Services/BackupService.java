package Fullstack.encargo_2.Services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import Fullstack.encargo_2.RespaldoDatos;
import Fullstack.encargo_2.Model.BackupModel;
import Fullstack.encargo_2.Model.CursoCatalogoModel;
import Fullstack.encargo_2.Model.Usuario;
import Fullstack.encargo_2.Repository.BackupRepository;
import Fullstack.encargo_2.Repository.CursoCatalogoRepository;
import Fullstack.encargo_2.Repository.UsuarioRepository;

@Service
public class BackupService {

    private final BackupRepository backupRepository;
    private final CursoCatalogoRepository cursoCatalogoRepository;
    private final UsuarioRepository usuarioRepository;
    private final ObjectMapper objectMapper; // Para convertir a JSON


    public BackupService(BackupRepository backupRepository, CursoCatalogoRepository cursoCatalogoRepository,
                         UsuarioRepository usuarioRepository, ObjectMapper objectMapper) {
        this.backupRepository = backupRepository;
        this.cursoCatalogoRepository = cursoCatalogoRepository;
        this.usuarioRepository = usuarioRepository;
        this.objectMapper = objectMapper;
    }
    public List<BackupModel> listarBackups() {
        return backupRepository.findAll();
    }



    public BackupModel crearBackup() {
        try {
            List<CursoCatalogoModel> cursos = cursoCatalogoRepository.findAll();
            List<Usuario> usuarios = usuarioRepository.findAll();

            // Convertir datos a formato JSON
            String datosRespaldo = objectMapper.writeValueAsString(
                new RespaldoDatos(cursos, usuarios)
            );

            BackupModel backup = new BackupModel(
                null, "Respaldo manual", LocalDateTime.now(), "EXITO", datosRespaldo
            );

            return backupRepository.save(backup);
        } catch (Exception e) {
            throw new RuntimeException("Error al generar el respaldo", e);
        }
    }

}
