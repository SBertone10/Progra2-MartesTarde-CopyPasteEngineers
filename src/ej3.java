import Implementacion.ColaPrioridad;
import Interface.ColaPrioridadTDA;

public class ej3 {
//Hospital de clinicas triage
     static void main(String[] args) {

        ColaPrioridadTDA guardia = new ColaPrioridad();
        guardia.InicializarColaPrioridad();


        System.out.println("=== Pacientes que llegan a la guardia ===");
        guardia.AcolarPrioridad(1, 1);   System.out.println("Paciente 1: pibe con un raspón = prioridad 1");
        guardia.AcolarPrioridad(2, 50);  System.out.println("Paciente 2: señora con fractura de brazo = prioridad 50");
        guardia.AcolarPrioridad(3, 100); System.out.println("Paciente 3: jubilado con un bobazo = prioridad 100");

        System.out.println("\n=== Orden de atención ===");
        int orden = 1;
        while (!guardia.ColaVacia()) {
            System.out.println(orden + ". Atendiendo paciente " + guardia.Primero() + " | Prioridad: " + guardia.Prioridad());
            guardia.Desacolar();
            orden++;
        }

        System.out.println("\nTodos los pacientes fueron atendidos.");
    }
}