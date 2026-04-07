import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej8 {
    // Distribucion de tickets IT
    public static void main(String[] args) {
        ColaPrioridadTDA mesaDeAyuda = new ColaPrioridad();
        mesaDeAyuda.InicializarColaPrioridad();

        System.out.println("=== Tickets que llegan a IT ===");
        mesaDeAyuda.AcolarPrioridad(1, 999);
        System.out.println("Ticket 1: se rompio el servidor principal | prioridad 999");

        mesaDeAyuda.AcolarPrioridad(2, 0);
        System.out.println("Ticket 2: no me gusta el fondo de pantalla | prioridad 0");

        System.out.println("\n=== Orden de atencion ===");
        while (!mesaDeAyuda.ColaVacia()) {
            System.out.println(
                    "Atendiendo ticket " + mesaDeAyuda.Primero() + " | prioridad " + mesaDeAyuda.Prioridad()
            );
            mesaDeAyuda.Desacolar();
        }

        System.out.println("\n=== Prioridades definidas ===");
        System.out.println("Servidor principal caido -> prioridad 999");
        System.out.println("Fondo de pantalla -> prioridad 0");
    }
}
