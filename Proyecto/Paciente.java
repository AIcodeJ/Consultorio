public class Paciente {
    private String ID;
    private String Nombre;
    private String Apellido;

    public Paciente(String ID, String nombre, String apellido){
        this.ID = ID;
        this.Nombre = nombre;
        this.Apellido = apellido;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void Mostrar(){
        System.out.println("\n\t---------------");
        System.out.println("ID Paciente: " + ID);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellidos: " + Apellido);
        System.out.println("\t---------------");
    }

}
