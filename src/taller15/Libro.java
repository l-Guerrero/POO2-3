package taller15;

public class Libro {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    // manejo de imformacion
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }

    // generacion de reportes
    public void generarReporte(){
        System.out.println("Reporte del libro: " + titulo + " por " + autor);
    }
    public void guardarEnBaseDeDatos(){
        System.out.println("Guardando libro: " + titulo + " en la base de datos");
    }
}
