package com.ApiRePersonas.model;


import jakarta.persistence.*;

@Entity
@Table(name = "estudiantes")
public class Estudent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombres", nullable = false, length = 100)
    private String nombres;
    @Column(name = "apellidoPaterno", nullable = false, length = 50)
    private String apellidoPaterno;
    @Column(name = "apellidoMaterno", nullable = false, length = 50)
    private String apellidoMaterno;
    @Column(name = "edad", nullable = false)
    private int edad;

    //Datos de contacto alumno
    @Column(name = "correoAlumno", nullable = true, length = 100, unique = true)
    private String correoAlumno;
    
    private String telefonoAlumno;

    //Datos de contacto del tutor
    private String correoTutor;
    private String telefonoTutor;

    public Estudent(String nombres, String apellidoPaterno, String apellidoMaterno,
                    int edad, String correoAlumno, String telefonoAlumno,
                    String correoTutor, String telefonoTutor) {
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.correoAlumno = correoAlumno;
        this.telefonoAlumno = telefonoAlumno;
        this.correoTutor = correoTutor;
        this.telefonoTutor = telefonoTutor;
    }
}
