import java.util.ArrayList;
import java.util.Scanner;

public class ListaCitas{

    private ListaDoctores doctores;
    private ListaPaciente pacientes;
    private ArrayList<Cita> citas;
    private Scanner leer;

    public ListaCitas(ListaDoctores d, ListaPaciente p) {
        citas = new ArrayList<Cita>();
        doctores = d;
        pacientes = p;
        leer = new Scanner(System.in);
    }

    public Cita nuevaCita() {
        System.out.println("\n\tNueva Cita");
        System.out.println("Introduzca ID de Cita: ");
        String id = leer.next();
        System.out.println("Ingresa la fecha: ");
        String fecha = leer.next();
        System.out.println("Ingresa la hora: ");
        String hora = leer.next();
        System.out.println("Ingrese el motivo: ");
        String motivo = leer.next();

        Doctor doctor = doctores.getDoc();
        Paciente paciente = pacientes.getPac();

        Cita nuevaC = new Cita(id, fecha, hora, motivo, doctor, paciente);
        citas.add(nuevaC);
        return nuevaC;
    }

    public boolean mostrarCitas() {
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        Cita cita = null;

        for (int i = 0; i < citas.size(); i++) {
            if (citas.get(i).getID().equals(id)) {
                cita = citas.get(i);
                cita.Mostrar();
            }
        }
        if (cita == null) {
            System.out.println("No se encuentra la cita con el ID:" + id);
        }
        return false;
    }

    public Cita getCita(String id){
        for (Cita cit : citas){
            return cit;
        }
        return null;
    }

}
