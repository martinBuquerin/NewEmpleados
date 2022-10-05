
package Dominio;

/**
 *
 * @author Martín
 */
 public class  Persona {
    private String nombre;
    private String apellido;
    private int id;
    private static int contador;
  
    
    public Persona() {
       this.id=++Persona.contador;
    }

    public Persona(String nombre, String apellido) {
        this();
        this.nombre = nombre;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id);
        sb.append(" Nombre: ").append(nombre);
        sb.append(" Apellidos: ").append(apellido);
        return sb.toString();
    }




    
    


    
    
    
    
    
}
