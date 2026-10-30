package com.example.zy6r_4E_Ian_Navarro_CC7.dto;

import com.example.zy6r_4E_Ian_Navarro_CC7.model.EstadoPrestamo;
import com.example.zy6r_4E_Ian_Navarro_CC7.model.VideojuegoModel;

import java.time.LocalDateTime;

public class ResponsePrestamoDto {
    private Long id;
    private String nombreSolicitante;
    private LocalDateTime fechaPrestamo;
    private LocalDateTime fechaDevolucion;
    private EstadoPrestamo estado;
    private VideojuegoModel game;

    public ResponsePrestamoDto(Long id, String nombreSolicitante, LocalDateTime fechaPrestamo,
                               LocalDateTime fechaDevolucion, EstadoPrestamo estado, VideojuegoModel game) {
        this.id = id;
        this.nombreSolicitante = nombreSolicitante;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.estado = estado;
        this.game = game;
    }

}
