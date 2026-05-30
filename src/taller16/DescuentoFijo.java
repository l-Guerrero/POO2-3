package taller16;

public class DescuentoFijo implements Descuento{
    private double montoFijo;

    public DescuentoFijo(double montoFijo){
        this.montoFijo = montoFijo;
    }
    @Override
    public double aplicarDescuento(double precio){
        return precio - montoFijo;
    }
}
