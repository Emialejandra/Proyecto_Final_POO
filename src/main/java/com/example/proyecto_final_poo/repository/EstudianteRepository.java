package com.example.proyecto_final_poo.repository;

import com.example.proyecto_final_poo.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
