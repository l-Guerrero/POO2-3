package taller16;

public class Main {
    public static void main(String[] args) {
        String texto = "Reporte financiero del mes";

        Documento pdf = new DocumentoPDF();
        pdf.exportar(texto);

        Documento word = new DocumentoWord();
        word.exportar(texto);

        Documento excel = new DocumentoExcel();
        excel.exportar(texto);

    }
}
