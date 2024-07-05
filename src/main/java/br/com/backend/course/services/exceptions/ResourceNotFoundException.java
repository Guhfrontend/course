package br.com.backend.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersonUID = 1L;

    public ResourceNotFoundException(Object id){
        super("Resource not found. id "+ id);
    }
}
