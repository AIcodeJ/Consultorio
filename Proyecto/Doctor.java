public class Doctor {

    private String ID;
    private String Nombre;
    private String Apellido;
    private String Especialidad;

    public Doctor(String ID, String nombre, String apellido, String especialidad){
        this.ID = ID;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Especialidad = especialidad;
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

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public void Mostrar(){
        System.out.println("\n\t---------------");
        System.out.println("ID Medico: " + ID);
        System.out.println("Nombre: " + Nombre);
        System.out.println("Apellidos: " + Apellido);
        System.out.println("Especialidad: " + Especialidad);
        System.out.println("\t---------------");
    }
}
