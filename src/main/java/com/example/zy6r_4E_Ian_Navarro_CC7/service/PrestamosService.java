package com.example.zy6r_4E_Ian_Navarro_CC7.service;

import com.example.zy6r_4E_Ian_Navarro_CC7.dto.RequestRegisterPrestamoDto;
import com.example.zy6r_4E_Ian_Navarro_CC7.exceptions.CustomException;
import com.example.zy6r_4E_Ian_Navarro_CC7.model.EstadoPrestamo;
import com.example.zy6r_4E_Ian_Navarro_CC7.model.PrestamoModel;
import com.example.zy6r_4E_Ian_Navarro_CC7.model.VideojuegoModel;
import com.example.zy6r_4E_Ian_Navarro_CC7.repository.PrestamoRepository;
import com.example.zy6r_4E_Ian_Navarro_CC7.repository.VideojuegoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

import static com.example.zy6r_4E_Ian_Navarro_CC7.model.EstadoPrestamo.ACTIVO;
import static com.example.zy6r_4E_Ian_Navarro_CC7.model.EstadoPrestamo.CANCELADO;

@Service
public class PrestamosService {
    private final PrestamoRepository prestamoRepo;
    private final VideojuegoRepository videojuegoRepo;

    public PrestamosService(PrestamoRepository prestamoRepo, VideojuegoRepository videojuegoRepo){
        this.prestamoRepo = prestamoRepo;
        this.videojuegoRepo = videojuegoRepo;
    }

    public PrestamoModel registrarPrestamo(RequestRegisterPrestamoDto dto){
        PrestamoModel prestamo = new PrestamoModel();
        VideojuegoModel game = videojuegoRepo.findById(dto.getVideogameId()).orElseThrow(
                () -> new CustomException("El videojuego no existe")
        );

        prestamo.setEstado(ACTIVO);
        prestamo.setFechaPrestamo(LocalDateTime.now());
        prestamo.setFechaDevolucion(null);
        game.setAvailable(false);
        prestamo.setVideojuego(game);


        prestamoRepo.save(prestamo);
        return prestamo;
    }

    public PrestamoModel cancelarPrestamo(Long id){
        PrestamoModel prestamo = prestamoRepo.findById(id).orElseThrow(
                () -> new CustomException("El id no es valido")
        );
        VideojuegoModel game = videojuegoRepo.findById(prestamo.getVideojuego().getId()).orElseThrow(
                () -> new CustomException("El videojuego no existe")
        );
        if (prestamo.getEstado() == ACTIVO){
            prestamo.setEstado(CANCELADO);
        }
        game.setAvailable(true);
        prestamoRepo.save(prestamo);
        return prestamo;
    }



}
