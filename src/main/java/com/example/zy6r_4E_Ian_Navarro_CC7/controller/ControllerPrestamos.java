package com.example.zy6r_4E_Ian_Navarro_CC7.controller;

import com.example.zy6r_4E_Ian_Navarro_CC7.dto.RequestRegisterPrestamoDto;
import com.example.zy6r_4E_Ian_Navarro_CC7.model.PrestamoModel;
import com.example.zy6r_4E_Ian_Navarro_CC7.service.PrestamosService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prestamos")
@CrossOrigin("*")
public class ControllerPrestamos {
    private final PrestamosService servicio;

    public ControllerPrestamos(PrestamosService servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/registrar")
    public ResponseEntity registrarPrestamo(RequestRegisterPrestamoDto dto){
        return ResponseEntity.ok(servicio.registrarPrestamo(dto));
    }

    public
}