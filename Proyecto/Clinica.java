import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Clinica {

    public static ArrayList<Administrador> administradores = new ArrayList<Administrador>();
    public static Scanner input = new Scanner(System.in);
    static ListaPaciente pacientes = new ListaPaciente();
    static ListaDoctores doctores = new ListaDoctores();
    static ListaCitas citas = new ListaCitas(doctores, pacientes);

    static boolean salir = false;

    public static void main(String[] args) {

        crearAdmins();

        if (validarAcceso()) {
            System.out.println("\nUsuario autorizado");
            menu();
        } else {
            System.out.println("\nUsuario no autorizado.");
        }
        System.out.print("\n\t\tFIN DE PROGRAMA");
    }

    private static void crearAdmins() {
        administradores.add(new Administrador("Alexis", "1234"));
        administradores.add(new Administrador("Omar", "5678"));
        administradores.add(new Administrador("Juan", "0000"));
    }

    private static boolean validarAcceso() {

        System.out.println("ACCESO AL SISTEMA");
        System.out.println("------ -- -------\n");
        System.out.print("Nombre: ");
        String nombre = input.nextLine();
        System.out.print("Password: ");
        String password = input.nextLine();

        Administrador admin = new Administrador(nombre, password);

        return administradores.contains(admin);
    }

    public static void menu() {
        // Hacemos un menu interactivo con Do While y agregamos una excepción para evitar errores en el menu
        do{
            System.out.println("\nBienvenido a la Clinica");
            System.out.println("1. Registrar nuevo doctor");
            System.out.println("2. Mostrar doctor");
            System.out.println("3. Nuevo Paciente (Ya sea nuevo o no el paciente)");
            System.out.println("4. Mostrar datos del Paciente");
            System.out.println("5. Nueva Cita");
            System.out.println("6. Mostrar Citas");
            System.out.println("0. Salir \n");
            try {
                System.out.println("Escribe una de las opciones \n");
                int opcion = input.nextInt();
                // Con lo que dijite el usuario se aplicara el caso con Switch
                switch (opcion) {
                    case 0:
                        salir = true;
                        break;
                    case 1:
                        doctores.nuevoDoctor();
                        break;
                    case 2:
                        doctores.mostrarDoctores();
                        break;
                    case 3:
                        pacientes.nuevoPaciente();
                        break;
                    case 4:
                        pacientes.mostrarPaciente();
                        break;
                    case 5:
                        citas.nuevaCita();
                        break;
                    case 6:
                        citas.mostrarCitas();
                        archivosJSON.save();
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6 \n");
                }
            } catch (InputMismatchException e) { //Este es el tipo de error que puede salir
                System.out.println("Opción no valida, debes insertar un número \n");
                input.next();
            }
        }
        while (!salir);
    }

}
