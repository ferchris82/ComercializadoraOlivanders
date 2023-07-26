
import java.util.Map;


public class Venta {
    private String numeroFactura;
    private Map<String, Integer> productosVendidos;
    private double valorTotal;
    
    //Constructor de la clase Venta.
    public Venta(String numeroFactura, Map<String, Integer> productosVendidos, double valorTotal) {
        this.numeroFactura = numeroFactura;
        this.productosVendidos = productosVendidos;
        this.valorTotal = valorTotal;
    }
    
    //Método para obtener el número de factura de la venta.
    public String getNumeroFactura() {
        return numeroFactura;
    }

//    public void setNumeroFactura(String numeroFactura) {
//        this.numeroFactura = numeroFactura;
//    }
    
    //Método para obtener los productos vendidos en la venta y sus cantidades
    public Map<String, Integer> getProductosVendidos() {
        return productosVendidos;
    }

//    public void setProductosVendidos(Map<String, Integer> productosVendidos) {
//        this.productosVendidos = productosVendidos;
//    }

    //Métodos para obtener el valor total de la venta
    public double getValorTotal() {
        return valorTotal;
    }

//    public void setValorTotal(double valorTotal) {
//        this.valorTotal = valorTotal;
//    }
    
}
