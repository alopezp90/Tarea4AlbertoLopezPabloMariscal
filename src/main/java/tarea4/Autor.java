package tarea4;

/**
 * @author Alberto López Puertas 
 * <alopezp90@gmail.com>
 */
public class Autor {
    
    String nombre;
    String apellido;
    int year;
    
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
    

}
