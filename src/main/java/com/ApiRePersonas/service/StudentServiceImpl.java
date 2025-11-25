package com.ApiRePersonas.service;

import com.ApiRePersonas.model.Student;
import com.ApiRePersonas.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepository repository;

    @Override
    public List<Student> listar() {
        return repository.findAll();
    }

    @Override
    public Student agregarRegistro(Student student) {
        return repository.save(student);
    }

    @Override
    public Optional<Student> obtenerById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
