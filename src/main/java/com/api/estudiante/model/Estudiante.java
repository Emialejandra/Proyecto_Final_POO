package com.api.estudiante.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Data;

@Entity
@Table(name = "estudiante")
@Data // Esta anotación de Lombok te ahorra escribir los Getters y Setters
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "Debe ingresar un formato de email válido")
    private String email;

    @NotNull(message = "La edad no puede ser nula")
    @Min(value = 16, message = "La edad mínima es 16 años")
    @Max(value = 60, message = "La edad máxima es 60 años")
    private Integer edad;

    @NotBlank(message = "La carrera es obligatoria")
    private String carrera;
}