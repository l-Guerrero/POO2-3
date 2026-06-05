package taller19;

public class mainPrueba {
    public static void main(String[] args) {
        GeneradorReporte reportePDF = new ReportePDF();
        GestorReportes gestorPDF = new GestorReportes(reportePDF);
        gestorPDF.crearReporte("Datos financieros del primer semestre");

        GeneradorReporte reporteExcel = new ReporteExcel();
        GestorReportes gestorExcel = new GestorReportes(reporteExcel);
        gestorExcel.crearReporte("Listado de asistencia de los estudiantes");
    }
}
