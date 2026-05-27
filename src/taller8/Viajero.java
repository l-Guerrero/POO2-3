package taller8;

public class Viajero  extends Vehiculo, Gerente, Persona {

    public Viajero( String marca, double velocidadMaxima, String nombre, double salario, int edad, String departamento){
        // Aqui se confunde el compilador porque no sabe a cual de las clases padre llamar ni como estructurar el objeto
        super(marca, velocidadMaxima);
    }
    public void intentoDeVerDatos(){
        System.out.println("Marca = " + this.marca);
        System.out.println("Salario = " + this.salario);

        // la clase hija no tiene permiso de ver los atributos privados
        System.out.println("Edad = " + this.edad);// edad es private en persona
        System.out.println("Departamento = " + this.departamento);// y departamento en Gerente
        
    }
}
