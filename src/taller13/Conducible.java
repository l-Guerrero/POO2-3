/*

package taller13;

public interface Conducible {
        void arrancar();
    }

    // primer error Bicicleta es una clase concreta, por lo que está
    // obligada a escribir el código del método arrancar de la interfaz
    // Como no lo hace, el compilador muestra un error.
    class Bicicleta implements Conducible {
        // Falta implementar arrancar
    }

    abstract class VehiculoMotorizado {

        // segundo error La palabra default es exclusiva de las interfaces.
        // Las clases abstractas no la necesitan porque siempre han podido tener
        // métodos con código en su interior de forma natural.
        default void encenderMotor() {
            System.out.println("Intentando encender el motor usando default");
        }

        //  la forma correcta seria
        void tocarClaxon() {
            System.out.println("¡Beep beep!");
        }
    }
 */