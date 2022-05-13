public class Administrador {

    private String Nombre;
    private String Password;

    public Administrador (String nombre, String password){
        this.Nombre = nombre;
        this.Password = password;
    }

    @Override
    public boolean equals(Object objeto) {
        if (objeto instanceof Administrador) { //Objeto si es clase Administrador
            //Casteamos objeto a Administrador
            Administrador Admin = (Administrador)objeto;
            //Coinciden ambos, los objetos representan al mismo Administrador
            return Nombre.equals(Admin.Nombre) && Password.equals(Admin.Password);
        } else {
            //Objeto a comparar no es de clase Administrador
            return false;
        }
    }
}
