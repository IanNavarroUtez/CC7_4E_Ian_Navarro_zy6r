package com.example.zy6r_4E_Ian_Navarro_CC7.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "prestamo")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PrestamoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    private String nombreSolicitante;

    private LocalDateTime fechaPrestamo;

    private LocalDateTime fechaDevolucion;

    private EstadoPrestamo estado;

    @ManyToOne
    @JoinColumn(name = "videojuego_id")
    private VideojuegoModel videojuego;
}
