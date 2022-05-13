public class Historial {

    private String Observaciones;
    private String Fecha;
    private Paciente idPaciente;
    private Doctor idDoctor;

    public Historial(String observaciones, String fecha, Paciente idPaciente, Doctor idDoctor){
        this.Observaciones = observaciones;
        this.Fecha = fecha;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
    }

    public Historial(){

    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String observaciones) {
        Observaciones = observaciones;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String fecha) {
        Fecha = fecha;
    }

    public Paciente getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Paciente idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Doctor getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Doctor idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void mostrarHistorial(){
        System.out.println("\n\t---------------");
        System.out.println("Fecha: " + Fecha);
        System.out.println("ID Paciente: " + idPaciente);
        System.out.println("ID Medico: " + idDoctor);
        System.out.println("Observaciones:\n" + Observaciones);
        System.out.println("\t---------------");
    }
}
