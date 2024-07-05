package br.com.backend.course.services.exceptions;

public class DataBaseExceptions extends RuntimeException{
    private static final long serialVersonUID = 1L;

    public DataBaseExceptions(String msg){
        super(msg);
    }
}
