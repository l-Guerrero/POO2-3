package taller16;

public class PruebaDescuento {
    public static void main(String[] args) {
        double precioNormal = 500000;

        Descuento descuentoPorcentaje = new DescuentoPorcentaje(50);
        double precioConPorcentaje = descuentoPorcentaje.aplicarDescuento(precioNormal);
        System.out.println("Precion normal : $" + precioNormal);
        System.out.println("Precio con 50% de descuento: $" + precioConPorcentaje);

        Descuento descuentoFijo = new DescuentoFijo(23000);
        double Preciofijo = descuentoFijo.aplicarDescuento(precioNormal);
        System.out.println("Precio con descuento fijo de 23000: $"+ Preciofijo );

    }
}
