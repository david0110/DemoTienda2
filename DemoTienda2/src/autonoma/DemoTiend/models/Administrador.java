package autonoma.DemoTiend.models;

/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Administrador extends Persona {
// Atributos
    /**
     * Se guarda el nombre del usuario del administrador
     */
    public String userName;
    /**
     * Se guarda la cpntraseña del administrador
     */
    public String password;
// Metodo constructor

    /**
     *
     */
    public Administrador(String useName, String password, String nombre, String cedula, String direccion) {
        super(nombre, cedula, direccion);
        this.userName = useName;
        this.password = password;
    }
// Metodos de acceso 
    /**
     * Guarda y muestra informacion en cada una de la variables
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
