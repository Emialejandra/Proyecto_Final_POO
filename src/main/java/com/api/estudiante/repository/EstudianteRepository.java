package com.api.estudiante.repository;

import com.api.estudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Capa de persistencia
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
