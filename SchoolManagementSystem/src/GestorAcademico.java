import Exceptions.EstudianteNoInscritoEncursoException;
import Exceptions.EstudianteYaInscritoException;
import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI{

    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Integer, Integer> inscripciones;

    public GestorAcademico(){
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
        System.out.println("Se ha matriculado al estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
    }

    @Override
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Se ha agregado la clase: " + curso.getNombre());
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) {
        try {
            for (Integer key : inscripciones.keySet()) {
                Integer value = inscripciones.get(key);
                if(estudiante.getId() == value & idCurso == key){
                    throw new EstudianteYaInscritoException();
                }
            }
            inscripciones.put(idCurso, estudiante.getId());
            System.out.println("Se ha inscrito al estudiante " + estudiante.getNombre() + " a la clase con el id:" + idCurso);
        }catch (EstudianteYaInscritoException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) {
        int exc = 0;
        try {
            for (Integer key : inscripciones.keySet()) {
                Integer value = inscripciones.get(key);
                if (key == idCurso & value == idEstudiante){
                    exc = 1;
                }
            }

            if (exc == 0){
                throw new EstudianteNoInscritoEncursoException();
            }

            inscripciones.remove(idCurso, idEstudiante);
            System.out.println("Se ha desinscrito al estudiante con el id:"+ idEstudiante +" de la clase con el id:"+idCurso);
        }catch (EstudianteNoInscritoEncursoException e){
            System.out.println(e.getMessage());
        }
    }
}
