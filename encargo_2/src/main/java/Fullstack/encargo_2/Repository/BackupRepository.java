package Fullstack.encargo_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fullstack.encargo_2.Model.BackupModel;

@Repository
public interface BackupRepository extends JpaRepository<BackupModel, Long> {
}

