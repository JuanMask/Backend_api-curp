package com.example.curp_api.repository;

import com.example.curp_api.model.Deudor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DeudorRepository extends JpaRepository<Deudor, Long> {
    Optional<Deudor> findByCurp(String curp);
}
