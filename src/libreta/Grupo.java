package libreta;

import libreta.Contacto;

/**
 * no dispone de métodos funcionales para la aplicación, los últimos métodos que tiene son getters y setters
 * permite agrupar los contactos en grupos
 * @author propa
 */
public class Grupo {
    private String nombre;
    private Contacto[] contactos;
    
    public Grupo(String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contacto[] getContactos() {
        return contactos;
    }

    public void setContactos(Contacto[] contactos) {
        this.contactos = contactos;
    }
    
    
    
}
    
