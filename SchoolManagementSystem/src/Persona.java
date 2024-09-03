import java.util.Date;

public class Persona {

    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;

    public Persona(int id, String nombre, String apellido, String fechaDeNacimiento, String estado){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.estado = estado;
    }

    public int getId(){ return id; }

    public String getNombre(){ return nombre; }

    public String getApellido(){ return apellido; }

}