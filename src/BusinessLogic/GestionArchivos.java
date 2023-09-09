package BusinessLogic;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class GestionArchivos {
    
    public String[][] obtenerDatos() throws IOException {
        String directorioHorario = "utilities\\horarios";
        File directorio = new File(directorioHorario);
        
        if (directorio.isDirectory()) {
            String[] listaArchivos = directorio.list();
            for (String archivoAlumno : listaArchivos) {
                if (archivoAlumno.endsWith(".csv")) {   
                    // alumnos.add(archivoAlumno.substring(0, archivoAlumno.lastIndexOf("."))); // .length()-4));
                    
                    List<String> lines = Files.readAllLines(Paths.get(directorioHorario + "archivoAlumno"));
                    int cantRegistros = lines.size();
                    String[][] datos = new String[cantRegistros][13];
                    int index = 0;
                    for (String linea : lines) {
                        datos[index] = linea.split(";");
                        index++;
                    }
                    return datos;
                }
            }
        } else {
            System.out.println(";/ Error en directorioHorario: "+ directorioHorario);
        }
        return null;
    }
}
