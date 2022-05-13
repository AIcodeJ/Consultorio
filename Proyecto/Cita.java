public class Cita {

    private String ID;
    private String Fecha;
    private String Hora;
    private String Motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String id, String fecha, String hora, String motivo, Doctor doctor, Paciente paciente){
        this.ID = id;
        this.Fecha = fecha;
        this.Hora = hora;
        this.Motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    public Cita(String id, String fecha, String hora, String motivo){
        this.ID = id;
        this.Fecha = fecha;
        this.Hora = hora;
        this.Motivo = motivo;
    }

    public String getID(){
        return ID;
    }

    public void setID(String id){
        ID = id;
    }

    public String getFecha(){
        return Fecha;
    }

    public void setFecha(String fecha){
        Fecha = fecha;
    }

    public String getHora(){
        return Hora;
    }

    public void setHora(String hora){
        Hora = hora;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String motivo) {
        Motivo = motivo;
    }

    public Doctor getDoctor(){
        return doctor;
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void Mostrar(){
        System.out.println("\n\t---------------");
        System.out.println("ID Cita: " + ID);
        System.out.println("Fecha: " + Fecha);
        System.out.println("Hora: " + Hora);
        System.out.println("Motivo: " + Motivo);
        System.out.println("\t---------------");
    }
}
