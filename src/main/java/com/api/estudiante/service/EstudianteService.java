package com.api.estudiante.service;

import com.api.estudiante.model.Estudiante;
import com.api.estudiante.repository.EstudianteRepository;
import com.api.estudiante.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {
    @Autowired // Inyeccion dependencia
    private EstudianteRepository estudianteRepository;

    //Listamos los estudiantes
    public List<Estudiante> listarTodos(){
        return estudianteRepository.findAll();
    }

    //Obtenemos estudiante por ID
    public Estudiante obtenerPorId(Long id) {
        return estudianteRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrado con ID: " + id));
    }


    //Crear o actualizar un estudiante
    public Estudiante guardar(Estudiante estudiante){
        return estudianteRepository.save(estudiante);
    }

    //Eliminar un estudiante
    public void eliminar(Long id){
        estudianteRepository.deleteById(id);
    }

}
