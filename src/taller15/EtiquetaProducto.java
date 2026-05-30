package taller15;

public class EtiquetaProducto {

    public void generarEtiqueta(Producto producto){
        System.out.println("Etíqueta = " + producto.getNombre() + " precio base $" + producto.getPrecioBase() );
    }
}
