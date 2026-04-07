import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej4 {
//Promocionados vs regulares
    static void main(String[] args) {

        ColaPrioridadTDA cartelera = new ColaPrioridad();
        cartelera.InicializarColaPrioridad();

        // El regular llega primero, el promocionado llega después
        System.out.println("=== Alumnos que se anotan en la cartelera ===");
        cartelera.AcolarPrioridad(1, 5);  System.out.println("Alumno 1 (regular)      se anotó a las 8:00 AM → prioridad 5");
        cartelera.AcolarPrioridad(2, 10); System.out.println("Alumno 2 (promocionado) se anotó a las 8:30 AM → prioridad 10");

        System.out.println("\n=== ¿Quién sale primero al hacer Desacolar? ===");
        System.out.println("Primero en salir: Alumno " + cartelera.Primero()
                + " | Prioridad: " + cartelera.Prioridad());
    }
}