package com.example.railway_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.railway_demo.model.Tarea;

public interface TareaRepository extends JpaRepository<Tarea, Long> {}

