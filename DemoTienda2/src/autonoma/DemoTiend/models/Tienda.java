package autonoma.DemoTiend.models;
/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Tienda {
// Atributos
    /**
     * Nombre de la tienda
     */
    private String nombre;
    /**
     * Direccin de la tienda
     */
    private String direccion;
    /**
     * Invantario de la tiena
     */
    private Inventario inventario;
    /**
     * Administrador de la tienda 
     */
    private Administrador administrador;
// Metodo constructor
    /**
     *  Inicializa los atributos de esta clase
     */
    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.inventario = new Inventario();
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Inventario getInventario() {
        return inventario;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

// Metodos de gestion de productos o CRUD de productos 
    /**
     *  Da la tarea de agregar un producto al invantario
     */
    public boolean agregarProducto (Producto producto){
        return this.inventario.agregarProducto(producto);
    }
    /**
     *  Busca un producto por el mismo producto
     */
    public Producto buscarProducto (Producto producto){
        return this.inventario.buscarProducto(producto);
    }
    /**
     *  Busca un producto por el id
     */
    public Producto buscarProducto (long id){
        return this.inventario.buscarProducto(id);
    }
    /**
     *  Da la tarea de actualizar un producto en el invantario
     */
    public Producto actualizarProducto (long id,Producto producto){
        return this.inventario.actualizarProducto(id,producto);
    }
    /**
     *  Da la tarea de eliminar un producto del invantario
     */
    public Producto eliminarProducto (long id){
        return this.inventario.eliminarProducto(id);
    }
    /**
     *  Da la tarea de mostrar el invantario
     */
    public String mostrarInventario (){
        return this.inventario.mostrarInventario();
    }
    /**
     *  Da la tarea de actualizar un producto en el invantario
     */
    public boolean iniciarSesion (String user, String password){
        return this.administrador.getUserName().equals(user) && this.administrador.getPassword().equals(password);
    }
}
