package Fullstack.encargo_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Fullstack.encargo_2.Model.Transaccion;


@Repository
public interface PaymentRepository extends JpaRepository<Transaccion, Long> {}
