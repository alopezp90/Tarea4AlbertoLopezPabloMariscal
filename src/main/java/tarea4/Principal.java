/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea4;

/**
 *
 * @author pablo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Autor pablo = new Autor ();
        pablo.setNombre("Pablo");
        pablo.setApellido ("Mariscal");
        pablo.setYear (2020);
        
        Autor alberto = new Autor ();
        alberto.setNombre("Alberto");
        alberto.setApellido ("López");
        alberto.setYear (2020);
        
        System.out.println(pablo.toString());
        System.out.println(alberto.toString());
        
    }
    
}
