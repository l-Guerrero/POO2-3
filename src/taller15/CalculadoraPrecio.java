package taller15;

public class CalculadoraPrecio {
    public double CalculoPrecioFinal( Producto producto, double porcentajeImpuesto){
        double precio = producto.getPrecioBase();
        return precio + (precio * porcentajeImpuesto);
    }
}
