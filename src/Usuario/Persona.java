
package Usuario;

import java.io.PrintWriter;


public class Persona {
    private int id;
    private String nombre;
    private String apellido;
    private int partidasJugadas;
    private int partidasGanadas;
    private int partidasPerdidas;

    public Persona(int id, String nombre, String apellido ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public void guardar(PrintWriter Escribe) {
        Escribe.println(id);
        Escribe.println(nombre);
        Escribe.println(apellido);
        
        
    }
  
    
    
}
 
