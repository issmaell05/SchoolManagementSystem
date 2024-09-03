package Exceptions;

public class EstudianteYaInscritoException extends Exception{

    public EstudianteYaInscritoException(){
        super("El estudiante ya se encuentra inscrito");
    }

}