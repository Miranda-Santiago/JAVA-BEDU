package simulacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {

    public static void main(String[] args) {
        // -Ruta del archivo
        Path ruta_carpeta = Paths.get("src/sesion7_reto1/config");
        Path ruta_archivo = ruta_carpeta.resolve("parametros.txt");

        //- Parámetros
        String parametros = "Hola \n" + "Tiempo de ciclo: 55.8 segundos\n"
                + "Velocidad de línea: 1.2 m/s\n"
                + "Número de estaciones: 8\n";

        try {
            // - Crear la carpeta si no existe
            if (!Files.exists(ruta_carpeta)) {
                Files.createDirectories(ruta_carpeta);
                System.out.println("- Carpeta 'config' creada.");
            }

            // - Escribir el contenido en el archivo (crea o sobrescribe)
            Files.write(ruta_archivo, parametros.getBytes());
            System.out.println("- Archivo de parámetros escrito correctamente.");

            // - Validar si el archivo fue creado
            if (Files.exists(ruta_archivo)) {
                System.out.println("- El archivo fue creado exitosamente en: " + ruta_archivo.toAbsolutePath());

                // - Leer el contenido y mostrarlo
                String contenidoleido = Files.readString(ruta_archivo);
                System.out.println("- Contenido del archivo:");
                System.out.println(contenidoleido);
            } else {
                System.out.println("- Error, archivo no creado con éxito.");
            }

        } catch (IOException e) {
            System.out.println("- Error al trabajar con el archivo: " + e.getMessage());
        }
    }
}
