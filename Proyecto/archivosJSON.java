import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.*;

public class archivosJSON{

    private static ListaCitas citas;

    public static void save() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String json = mapper.writeValueAsString(citas.nuevaCita());
            System.out.println(json);
            String ruta = "citas.json";

            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(json);
            bw.close();
        } catch (Exception e) {
            System.out.println("Error->" + e.getMessage());
        }
    }

    /*public static void cargarCita() throws IOException {
        String json = leerArchivo();
        Gson gson = new Gson();
        Cita[] cita = gson.fromJson(json, Cita[].class);
        citas.nuevaCita().add(cita);
        for (Cita temp : cita) {
            citas.nuevaCita().add(temp);
        }
        System.out.println("Hola mundo");
    }*/

    /*public static String leerArchivo() throws IOException {
        String archivo = "citas.json";
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        StringBuilder json = new StringBuilder();
        String cadena;
        while ((cadena = b.readLine()) != null) {
            json.append(cadena);
        }
        b.close();
        return json.toString();
    }*/

}
