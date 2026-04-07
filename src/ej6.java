import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej6 {
    // Procesador de tareas del sistema operativo
    public static void main(String[] args) {
        ColaPrioridadTDA scheduler = new ColaPrioridad();
        scheduler.InicializarColaPrioridad();

        System.out.println("=== Procesos que llegan al scheduler ===");
        scheduler.AcolarPrioridad(1001, 50);
        System.out.println("Proceso 1001: servicio del sistema | prioridad 50");

        scheduler.AcolarPrioridad(2001, 10);
        System.out.println("Proceso 2001: Spotify del usuario | prioridad 10");

        scheduler.AcolarPrioridad(1002, 50);
        System.out.println("Proceso 1002: actualizacion del sistema | prioridad 50");

        scheduler.AcolarPrioridad(2002, 10);
        System.out.println("Proceso 2002: navegador del usuario | prioridad 10");

        scheduler.AcolarPrioridad(1003, 50);
        System.out.println("Proceso 1003: driver del sistema | prioridad 50");

        System.out.println("\n=== Orden de ejecucion ===");
        while (!scheduler.ColaVacia()) {
            System.out.println(
                    "Ejecutando proceso " + scheduler.Primero() + " | prioridad " + scheduler.Prioridad()
            );
            scheduler.Desacolar();
        }

        System.out.println("\n=== Que pasa si el sistema se sobrecarga ===");
        System.out.println("Los procesos con prioridad 50 salen antes que los de prioridad 10.");
        System.out.println("Si siguen entrando procesos importantes, Spotify y otros procesos del usuario pueden esperar mas tiempo.");
        System.out.println("En una sobrecarga fuerte, los procesos de baja prioridad pueden quedar casi sin ejecutarse.");
    }
}
