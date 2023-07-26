
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        //Creamos una instancia de la clase inventario
        Inventario inventario = new Inventario();
        
        //Agregamos productos al inventario con sus respectivas cantidades.
        inventario.agregarProducto("POO1", 50);
        inventario.agregarProducto("POO2", 30);
        inventario.agregarProducto("POO3", 20);
        
        //Mostramos el inventario actual.
        inventario.verInventario();
        
        //Eliminamos un producto del inventario.
        inventario.eliminarProducto("POO2");
        
        //Modificamos la cantidad de un producto en el inventario.
        inventario.modificarCantidad("POO1", 20);
        
        //Mostramos el inventario actualizado.
        inventario.verInventario();
        
        //Creamos una instancia de la clase RegistroVentas
        RegistroVentas registroVentas = new RegistroVentas();
        
        //Creamos un mapa para representar los productos vendidos en una venta.
        Map<String, Integer> productosVenta1 = new HashMap<>();
        productosVenta1.put("P001", 5);
        productosVenta1.put("P003", 10);
        
        //Registramos una nueva venta en el registro de ventas.
        registroVentas.registrarVenta("F001", productosVenta1, 1500);
        
        //Creamos otro mapa para representar los productos vendidos en otra venta
        Map<String, Integer> productosVenta2 = new HashMap<>();
        productosVenta2.put("P001", 10);
        
        //Registramos otra venta en el registro de ventas.
        registroVentas.registrarVenta("F002", productosVenta2, 500);
        
        //Mostramos el registro completo de ventas.
        registroVentas.verVentas();
    }
    
}
