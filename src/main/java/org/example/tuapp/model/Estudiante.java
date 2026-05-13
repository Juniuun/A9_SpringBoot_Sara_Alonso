package org.example.tuapp.model;

import jakarta.persistence.*;

import lombok.Data; // Si usas Lombok, te ahorras escribir getters y setters

@Entity

@Table(name = "estudiantes")

@Data // Elimina esto y genera getters/setters manualmente (Click derecho -> Generate) si no usas Lombok

public class Estudiante {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String nombre;

    private String email;

    private int edad;

}
