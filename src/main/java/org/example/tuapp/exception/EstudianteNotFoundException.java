package org.example.tuapp.exception;

public class EstudianteNotFoundException extends RuntimeException {

    public EstudianteNotFoundException(Long id) {
        super("Estudiante con ID " + id + " no encontrado");
    }
}
