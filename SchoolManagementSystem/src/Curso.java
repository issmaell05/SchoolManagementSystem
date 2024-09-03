public class Curso {

    private int id;
    private String nombre;
    private String descripción;
    private int numeroCreditos;
    private String versión;

    public Curso(int id, String nombre, String descripción, int numeroCreditos, String versión){
        this.id = id;
        this.nombre = nombre;
        this.descripción = descripción;
        this.numeroCreditos = numeroCreditos;
        this.versión = versión;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){ return nombre; }
}
