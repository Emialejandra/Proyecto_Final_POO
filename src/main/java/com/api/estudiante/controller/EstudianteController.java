package com.api.estudiante.controller;

import com.api.estudiante.model.Estudiante;
import com.api.estudiante.service.EstudianteService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estudiante") // Ruta base solicitada [cite: 18]
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    // 1. Listar todos
    @GetMapping
    public List<Estudiante> listar() {
        return estudianteService.listarTodos();
    }

    // 2. Obtener por ID
    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable Long id) {
        return ResponseEntity.ok(estudianteService.obtenerPorId(id));
    }

    // 3. Crear nuevo
    @PostMapping
    public ResponseEntity<Estudiante> crear(@Valid @RequestBody Estudiante estudiante) {
        return new ResponseEntity<>(estudianteService.guardar(estudiante), HttpStatus.CREATED);
    }

    // 4. Actualizar
    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable Long id, @Valid @RequestBody Estudiante estudiante) {
        Estudiante existente = estudianteService.obtenerPorId(id);
        estudiante.setId(existente.getId());
        return ResponseEntity.ok(estudianteService.guardar(estudiante));
    }

    // 5. Eliminar
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        estudianteService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}