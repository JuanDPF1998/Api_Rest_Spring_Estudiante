package com.ApiRePersonas.service;

import com.ApiRePersonas.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public List<Student> listar();
    public Student agregarRegistro(Student student);
    public Optional<Student> obtenerById(Long id);
    public Student update(Student student);
    public void deleteById(Long id);
}
