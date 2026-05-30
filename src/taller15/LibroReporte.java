package taller15;

public class LibroReporte {
    public void generarReporte (Libro libro){
        System.out.println("Reporte del libro: " + libro.getTitulo() + " por " + libro.getAutor());
    }
}
