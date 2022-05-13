import java.util.ArrayList;
import java.util.Scanner;

public class ListaCitas extends ListaPaciente {

    private ArrayList<Cita> citas;
    private Scanner leer;

    public ListaCitas() {
        super();
        citas = new ArrayList<Cita>();
        leer = new Scanner(System.in);
    }

    public Cita nuevaCita() {
        System.out.println("\n\tNueva Cita");
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        System.out.println("Ingresa la fecha: ");
        String fecha = leer.next();
        System.out.println("Ingresa la hora: ");
        String hora = leer.next();
        System.out.println("Ingrese el motivo: ");
        String motivo = leer.next();

        Cita nuevaC = new Cita(id, fecha, hora, motivo);
        citas.add(nuevaC);
        return nuevaCita();
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
            System.out.println("No se encuentra la cita con el ID:\n" + id);
        }
        return false;
    }

    public Cita getCita(String id){
        for (Cita cit : citas){
            if (cit.getID().equals(id)){
                return cit;
            }
        }
        return null;
    }

}
