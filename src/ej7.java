import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej7 {
    // Embarque de aerolineas
    public static void main(String[] args) {
        ColaPrioridadTDA embarque = new ColaPrioridad();
        embarque.InicializarColaPrioridad();

        System.out.println("=== Llegada de pasajeros ===");
        embarque.AcolarPrioridad(101, 1);
        System.out.println("Pasajero 101: clase turista | prioridad 1");

        embarque.AcolarPrioridad(202, 3);
        System.out.println("Pasajero 202: movilidad reducida | prioridad 3");

        embarque.AcolarPrioridad(303, 2);
        System.out.println("Pasajero 303: business | prioridad 2");

        embarque.AcolarPrioridad(404, 3);
        System.out.println("Pasajero 404: movilidad reducida | prioridad 3");

        embarque.AcolarPrioridad(505, 1);
        System.out.println("Pasajero 505: clase turista | prioridad 1");

        System.out.println("\n=== Orden de embarque ===");
        while (!embarque.ColaVacia()) {
            System.out.println(
                    "Sube pasajero " + embarque.Primero() + " | prioridad " + embarque.Prioridad()
            );
            embarque.Desacolar();
        }

        System.out.println("\n=== Comportamiento con misma prioridad ===");
        System.out.println("Si llegan dos personas con la misma prioridad, se respeta el orden de llegada.");
        System.out.println("En este ejemplo, el pasajero 202 sube antes que el 404 porque ambos tienen prioridad 3 y 202 llego primero.");
    }
}
