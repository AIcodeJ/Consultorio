import java.util.ArrayList;
import java.util.Scanner;

public class ListaPaciente {

    private ArrayList<Paciente> pacientes;
    private Scanner leer;

    public ListaPaciente(){
        pacientes = new ArrayList<Paciente>();
        leer = new Scanner(System.in);
    }

    public Paciente nuevoPaciente() {
        System.out.println("\n\t NUEVO PACIENTE");
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        System.out.println("Ingrese el nombre: ");
        String nom = leer.next();
        System.out.println("Ingrese la apellido: ");
        String ap = leer.next();
        Paciente nuevoP = new Paciente(id, nom, ap);
        pacientes.add(nuevoP);
        return nuevoP;
    }

    public boolean mostrarPaciente(){
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        Paciente paciente = null;

        for (int i = 0; i < pacientes.size(); i++) {
            if(pacientes.get(i).getID().equals(id)) {
                paciente = pacientes.get(i);
                paciente.Mostrar();
            }
        }
        if(paciente == null){
            System.out.println("No se encuentra el paciente con el ID:\n" + id);
        }
        return false;
    }

    public Paciente getPac(){
        for (Paciente pac : pacientes){
            return pac;
        }
        return null;
    }

}
