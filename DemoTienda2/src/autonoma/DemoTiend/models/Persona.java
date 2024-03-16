package autonoma.DemoTiend.models;

/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public abstract class Persona {
// Atributos
    /**
     * Nombre de la persona
     */
    private String nombre;
    /**
     * Cedula de la persona
     */
    private String cedula;
    /**
     * Direccion de la persona
     */
    private String direccion;   
// Metodo constructor
    /**
     *  Inicializa los atributos
     */ 
    public Persona(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }
// Metodos de acceso 
    /**
     *  Guarda y muestra informacion en cada una de la variables
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
