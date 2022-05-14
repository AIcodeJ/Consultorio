import java.util.ArrayList;
import java.util.Scanner;

public class ListaDoctores {

    private ArrayList<Doctor> doctores;
    private Scanner leer;

    public ListaDoctores(){
        doctores = new ArrayList<Doctor>();
        leer = new Scanner(System.in);
    }

    public Doctor nuevoDoctor() {
        System.out.println("\n\t Nuevo Doctor");
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        System.out.println("Ingrese el nombre: ");
        String nom = leer.next();
        System.out.println("Ingrese la apellido: ");
        String ap = leer.next();
        System.out.println("Ingrese la especialidad: ");
        String esp = leer.next();

        Doctor nuevoD = new Doctor(id, nom, ap, esp);
        doctores.add(nuevoD);
        return nuevoD;
    }

    public boolean mostrarDoctores(){
        System.out.println("Introduzca ID: ");
        String id = leer.next();
        Doctor doctor = null;

        for (int i = 0; i < doctores.size(); i++) {
            if(doctores.get(i).getID().equals(id)) {
                doctor = doctores.get(i);
                doctor.Mostrar();
            }
        }
        if(doctor == null){
            System.out.println("No se encuentra el doctor con el ID:" + id);
        }
        return false;
    }

    public Doctor getDoc(){
        for (Doctor doc : doctores){
            return doc;
        }
        return null;
    }

}
