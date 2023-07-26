
import java.util.HashMap;
import java.util.Map;

//Clase para representar el inventario de productos.
public class Inventario {
    private Map<String, Producto> productos;
    
    //Constructor del inventario

    public Inventario() {
        productos = new HashMap<>(); // Creamos un HashMap vacío para almacenar los productos 
    }
    
    //Método para agregar un producto al inventario.
    public void agregarProducto(String id, int cantidad){
        if(productos.containsKey(id)){
            //Si el producto ya existe, actualizamos la cantidad.
            Producto productoExistente = productos.get(id);
            productoExistente.setCantidad(productoExistente.getCantidad() + cantidad);
        }else{
            //Si el producto no existe, lo agregamos al inventario.
            Producto nuevoProducto = new Producto(id, cantidad);
            productos.put(id, nuevoProducto);
        }
    }
    
    //Método para eliminar el producto del inventario.
    public void eliminarProducto(String id){
        productos.remove(id);
    }
    //Método para modificar la cantidad del producto en el inventario.
    public void modificarCantidad(String id, int nuevaCantidad){
        if(productos.containsKey(id)){
            Producto producto = productos.get(id);
            producto.setCantidad(nuevaCantidad);
        }
    }
    //Método para mostrar el inventario completo.
    public void verInventario(){
        System.out.println("Inventario");
        for(Producto producto : productos.values()){
            System.out.println("ID: " + producto.getId() + ", Cantidad: " + producto.getCantidad());
        }
    }
    
}
