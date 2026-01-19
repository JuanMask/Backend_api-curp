package com.example.curp_api.service;

import com.example.curp_api.repository.DeudorRepository;
import org.springframework.stereotype.Service;

@Service
public class DeudorService {
    private final DeudorRepository deudorRepository;

    public DeudorService(DeudorRepository deudorRepository){
        this.deudorRepository = deudorRepository;
    }

    public boolean esDeudor(String curp){
        return deudorRepository
            .findByCurp(curp)
            .map(deudor -> deudor.getstatus())
            .orElse(false);
    }
}
