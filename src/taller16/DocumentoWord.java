package taller16;

public class DocumentoWord implements Documento{
    @Override
    public void exportar ( String contenido){
        System.out.println("Generando archivo word: " + contenido);
    }

}
