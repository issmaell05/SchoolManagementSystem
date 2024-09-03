package Exceptions;

public class EstudianteNoInscritoEncursoException extends Exception{

    public EstudianteNoInscritoEncursoException(){
        super("El estudiante no se encuentra inscrito");
    }

}