package autonoma.DemoTienda.main;

import autonoma.DemoTiend.models.Administrador;
import autonoma.DemoTiend.models.Producto;
import autonoma.DemoTiend.models.Tienda;
import autonoma.DemoTienda.views.IniciarSesion;
import autonoma.DemoTienda.views.VentanaPrincipal;

/**
 * @author DOSSA0110
 * @version 1.0.0
 * @since 2024/03/14
 */
public class DemoTienda {
    public static void main (String[] args){
        Tienda tienda = new Tienda("Burrosmania","Cl 5 #18-250");
        Administrador  admin = new Administrador("David","0110","David","1018230810","Cl 5 #18-250");
        tienda.setAdministrador(admin);
        VentanaPrincipal ventana = new VentanaPrincipal(tienda);
        IniciarSesion login = new IniciarSesion(ventana,true,tienda,ventana);
        login.setVisible(true);
    }
}
