package taller15;

    public class Producto {
    private String nombre;
    private double precioBase;

    public Producto (String nombre, double precioBase) {
        this.nombre = nombre;
        this.precioBase = precioBase;
    }
        public String getNombre(){
            return nombre;
        }
        public double getPrecioBase() {
            return precioBase;
        }
        public void generarEtiqueta(){
            System.out.println("Etíqueta: " + nombre + " Precio base: $" + getPrecioBase());
        }
        public double CalculoPrecioFinal(double porcentajeImpuesto) {
        return precioBase + ( precioBase * porcentajeImpuesto);
        }
    }
    

