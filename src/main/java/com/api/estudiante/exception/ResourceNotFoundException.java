package com.api.estudiante.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// Nos devuelve un error 404
@ResponseStatus(value = HttpStatus.NOT_FOUND)

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String mensage){
        super(mensage);
    }
}
