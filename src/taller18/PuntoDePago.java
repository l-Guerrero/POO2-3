package taller18;

public class PuntoDePago implements PagadorFacturas {

    @Override
    public void pagarFacturas(String servicio) {
        System.out.println("Procesando el pago de la factura de: " + servicio);
    }
}
