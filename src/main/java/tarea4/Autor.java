package tarea4;

/**
 * @author Alberto López Puertas 
 * <alopezp90@gmail.com>
 */
public class Autor {
    
    private String nombre;
    private String apellido;
    private int year;
    
    public Autor (String nombre, String apellido, int year) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.year = year;
    }
    
    public Autor () {
        this.nombre = "";
        this.apellido = "";
        this.year = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    

}
