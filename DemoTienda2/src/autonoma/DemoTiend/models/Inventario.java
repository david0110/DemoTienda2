package autonoma.DemoTiend.models;
import java.util.ArrayList;

/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public class Inventario {
// Atributos

    /**
     * Guarda la lista de todos los productos que hay
     */
    private ArrayList<Producto> productos;
// Metodo constructor
    /**
     *
     */
    public Inventario() {
        this.productos = new ArrayList<>();
    }

// Metodos de acceso 
    /**
     * Guarda y muestra informacion en cada una de la variables
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }
// Metodos de gestion de productos o CRUD de productos 

    /**
     * recibe un pruducto como parametro y lo agrega y lo agrega a el ArrayList
     */
    public boolean agregarProducto(Producto producto) {
        return this.productos.add(producto);
    }

    /**
     * Buscamos el producto por medio del producto
     */
    public Producto buscarProducto(Producto producto) {
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.equals(producto)) {
                return p;
            }
        }
        return null;
    }

    /**
     * Buscamos el producto por medio de el id del producto
     */
    public Producto buscarProducto(long id) {
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Busca la posicion del producto en do nde esta guardado y con esta
     * posicion podemos actualizar el producto
     */
    private int buscarIndiceProducto(long id) {
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p = this.productos.get(i);
            if (p.getId() == id) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Con el id encontrado se accede a el producto y se actualizan algunos
     * datos
     */
    public Producto actualizarProducto(long id, Producto producto) {
        int index = this.buscarIndiceProducto(id);
        if (index >= 0) {
            return this.productos.set(index, producto);
        } else {
            return null;
        }
    }

    /**
     * Con el id encontrado se accede a la lista y se elimina el producto
     */
    public Producto eliminarProducto(long id) {
        int index = this.buscarIndiceProducto(id);
        if (index >= 0) {
            return this.productos.remove(index);
        } else {
            return null;
        }
    }
    /**
     * Muestra el inventario en la consola
     */
    public String mostrarInventario(){
        String inventario = "";
        for (int i = 0; i < this.productos.size(); i++) {
            Producto p =this.productos.get(i);
            inventario += p.toString()+"\n";
        }
        return inventario;
    }
}
