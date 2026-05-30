package taller15;

public class Libro2 {
    private String titulo;
    private String autor;
    private String isbn;

    public Libro2(String titulo, String autor, String isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    public String getTitulo(){return titulo;}
    public String getAutor(){return autor;}
    public String getIsbn(){return isbn;}
}
