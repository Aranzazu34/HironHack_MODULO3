package com.example.railway_demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.example.railway_demo.model.Tarea;
import com.example.railway_demo.repository.TareaRepository;

@RestController
@RequestMapping("/tareas")
@CrossOrigin("*") // IMPORTANTE para que el front en GitHub Pages pueda acceder
public class TareaController {

    private final TareaRepository repository;

    public TareaController(TareaRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Tarea> getAll() {
        return repository.findAll();
    }

    @PostMapping
    public Tarea create(@RequestBody Tarea tarea) {
        return repository.save(tarea);
    }

    @PutMapping("/{id}")
    public Tarea update(@PathVariable Long id, @RequestBody Tarea tarea) {
        return repository.findById(id).map(t -> {
            t.setTitulo(tarea.getTitulo());
            t.setCompletada(tarea.isCompletada());
            return repository.save(t);
        }).orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repository.deleteById(id);
    }
}

