import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej1 {
//EJ1 FILA BANCO

    static void main(String[] args) {

        ColaPrioridadTDA filaBanco = new ColaPrioridad();
        filaBanco.InicializarColaPrioridad();

        System.out.println(" Llegan clientes al banco ");
        System.out.println("Llega cliente 101 con prioridad 2 (cliente común)");
        filaBanco.AcolarPrioridad(101, 2);

        System.out.println("Llega cliente 202 con prioridad 5 (cliente con discapacidad)");
        filaBanco.AcolarPrioridad(202, 5);

        System.out.println("Llega cliente 303 con prioridad 1 (turno normal)");
        filaBanco.AcolarPrioridad(303, 1);

        System.out.println("Llega cliente 404 con prioridad 5 (otro cliente con discapacidad)");
        filaBanco.AcolarPrioridad(404, 5);

        System.out.println("Llega cliente 505 con prioridad 3 (cliente preferencial)");
        filaBanco.AcolarPrioridad(505, 3);

        System.out.println("\n=== Atendiendo clientes en orden de prioridad ===");
        while (!filaBanco.ColaVacia()) {
            System.out.println("Atendiendo cliente: " + filaBanco.Primero() + " | Prioridad: " + filaBanco.Prioridad());
            filaBanco.Desacolar();
        }

        System.out.println("\nTodos los clientes fueron atendidos.");
    }
}