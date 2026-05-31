package taller14;

public class mainn {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona estudiante = new Estudiante();
        Persona profesor = new Profesor();

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
