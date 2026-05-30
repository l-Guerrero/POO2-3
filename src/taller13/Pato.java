package taller13;

public class Pato implements Volador, Nadador{
    @Override
    public void volar (){
        System.out.println("El pato está volando");
    }
    @Override
    public void nadar(){
        System.out.println("El pato está nadando");
    }
}
class main{
    public static void main(String[] args) {
        Pato pato = new Pato();
        pato.nadar();
        pato.volar();
    }
}
