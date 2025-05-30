package Fullstack.encargo_2.Controller;


import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Fullstack.encargo_2.Model.BackupModel;
import Fullstack.encargo_2.Services.BackupService;

@RestController
@RequestMapping("/api/v1/backup")
public class BackupController {

    private final BackupService backupService;

    public BackupController(BackupService backupService) {
        this.backupService = backupService;
    }


    @GetMapping
    public ResponseEntity<List<BackupModel>> listarBackups() {
        List<BackupModel> respaldos = backupService.listarBackups();
        return ResponseEntity.ok(respaldos);
    }


    @PostMapping
    public ResponseEntity<String> createBackup() {
        backupService.crearBackup();
        return ResponseEntity.ok("Respaldo guardado correctamente.");
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> eliminar (@PathVariable Long id){
            try{
            backupService.delete(id);
            return ResponseEntity.noContent().build();
        }catch(Exception e){
            return ResponseEntity.notFound().build();
        }
        
    
    }
}



