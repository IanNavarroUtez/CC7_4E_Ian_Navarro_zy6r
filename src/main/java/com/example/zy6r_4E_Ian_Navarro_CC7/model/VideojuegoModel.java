package com.example.zy6r_4E_Ian_Navarro_CC7.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "videojuego")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VideojuegoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String title;

    private String platform;

    private boolean available;
}
