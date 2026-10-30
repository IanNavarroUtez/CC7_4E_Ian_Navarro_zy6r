package com.example.zy6r_4E_Ian_Navarro_CC7.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestRegisterPrestamoDto {
    @NotBlank(message = "El nombre no puede estar vacio")
    private String nombreSolicitante;
    @NotNull(message = "Ingresa un id valido")
    private Long videogameId;
    
}
