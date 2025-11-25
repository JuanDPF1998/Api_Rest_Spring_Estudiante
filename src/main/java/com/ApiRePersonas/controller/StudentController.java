package com.ApiRePersonas.controller;

import com.ApiRePersonas.model.Student;
import com.ApiRePersonas.repository.StudentRepository;
import com.ApiRePersonas.service.StudentService;
import com.ApiRePersonas.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {
    @Autowired
    private StudentService service;

    @GetMapping("/listar")
    public List<Student> listarTodos(){
        return service.listar();
    }
    @PostMapping()
    public Student agregarEstudiante(@RequestBody Student student){
        return service.agregarRegistro(student);
    }
    @GetMapping("/{id}")
    public Student obtenerEstufiantePorId(@PathVariable Long id){
        return service.obtenerById(id).orElse(null);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Student> actualizarEstudiante(@PathVariable Long id, @RequestBody Student student){
        Student objestudiante = new Student();
        objestudiante.setId(id);
        objestudiante.setNombres(student.getNombres());
        objestudiante.setApellidoPaterno(student.getApellidoPaterno());
        objestudiante.setApellidoMaterno(student.getApellidoMaterno());
        objestudiante.setEdad(student.getEdad());
        objestudiante.setCorreoAlumno(student.getCorreoAlumno());
        objestudiante.setTelefonoAlumno(student.getTelefonoAlumno());
        objestudiante.setCorreoTutor(student.getCorreoTutor());
        objestudiante.setTelefonoTutor(student.getTelefonoTutor());
        return ResponseEntity.ok(service.update(objestudiante));
    }
    @DeleteMapping("/{id}")
    public void eliminarPorId(@PathVariable Long id){
         service.deleteById(id);
    }
}
