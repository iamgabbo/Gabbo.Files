//Clase Carrito
import java.util.ArrayList; //Importamos la clase ArrayList del paquete java.util

public class Carrito {
    
    private ArrayList<Producto> productos; //Creamos una lista de productos

    
    public Carrito() { //Constructor de la clase
        
        this.productos = new ArrayList<Producto>(); //Inicializa la lista de productos vacía
    }

    
    public void agregarProducto(Producto producto) { //Método para agregar un producto al carrito
        
        this.productos.add(producto); //Añade el producto a la lista de productos
    }

    
    public void eliminarProducto(int indice) { //Método para eliminar un producto del carrito
        
        this.productos.remove(indice); //Elimina el producto de la lista de productos
    }

    
    public void mostrarProductos() { //Método para mostrar los productos del carrito
        
        System.out.println("Productos en el carrito:"); //Imprime el mensaje "Productos en el carrito:"
        
        for (Producto producto : this.productos) { //Recorre la lista de productos
            
            System.out.println(producto.getTitulo()); //Imprime el título de cada producto en la lista
        }
    }

    
    public double calcularTotal() { //Método para calcular el total a abonar por los productos del carrito
        
        double total = 0; //Inicializa la variable "total" en cero
        
        for (Producto producto : this.productos) { //Recorre la lista de productos
            
            total += producto.calcularPrecioVenta(); //Suma el precio de venta de cada producto al total
        }
        
        return total; //Retorna el total a abonar
    }
}
