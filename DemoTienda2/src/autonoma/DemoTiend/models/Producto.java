package autonoma.DemoTiend.models;
/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Producto {

    private static int contadorProducto = 1;
// Atributos
    /**
     * Cuenta la cantidad de productos 
     */
    private long id;
    /**
     * Nombre del producto
     */
    private String nombre;
    /**
     * Precio del producto
     */
    private double precio;
// Metodo constructor
    /**
     * Uando se crea un objeto se incrementa el contador
     */
    public Producto() {
        this.id = Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;
    }

    public Producto(String nombre, double precio) {
        this.id = Producto.contadorProducto;
        this.nombre = nombre;
        this.precio = precio;
        contadorProducto++;

    }
// Metodos de acceso 
    /**
     * Guarda y muestra informacion en cada una de la variables
     */
   
    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

// Metodos
    /**
     * Muestra en consola los datos que tenemos en los productos
     */
    @Override
    public String toString(){
        return "Producto "+id+"\n"+
                "  Nombre:  "+nombre+"\n"+
                "  Precio:  "+precio+"\n";
    }
}
