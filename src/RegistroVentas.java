
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

//Clase para representar el registro de ventas.
public class RegistroVentas {
    private List<Venta> ventas;
    
    //Constructor del registro de ventas

    public RegistroVentas() {
        ventas = new ArrayList<>(); // Creamos una lista vacía para almacenar las ventas.
    }
    
    //Método para registrar una nueva venta.
    public void registrarVenta(String numeroFactura, Map<String, Integer> productosVendidos, double valorTotal){
        Venta venta = new Venta(numeroFactura, productosVendidos, valorTotal);
        ventas.add(venta); //Agregamos la venta a la lista de ventas
    }
    //Método para mostrar el registro completo de ventas.
    public void verVentas(){
        System.out.println("Registro de ventas:");
        for(Venta venta : ventas){
            System.out.println("Factura: " + venta.getNumeroFactura() +
                    ", Productos: " + venta.getProductosVendidos() +
                    ", Valor total: " + venta.getValorTotal());
        }
    }
    
}
