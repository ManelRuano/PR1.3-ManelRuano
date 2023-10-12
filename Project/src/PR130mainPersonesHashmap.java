import java.util.HashMap;
import java.io.*;
import java.util.Map;

public class PR130mainPersonesHashmap {
    public static void main(String[] args) {
        // Crear un HashMap<String, Integer> con nombres y edades
        HashMap<String, Integer> personas = new HashMap<>();

        // Agregar datos predefinidos
        personas.put("Persona1", 25);
        personas.put("Persona2", 30);
        personas.put("Persona3", 28);
        personas.put("Persona4", 35);
        personas.put("Persona5", 22);

        String archivo = "PR130persones.dat";

        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(archivo))) {
            // Escribir los datos en el archivo
            for (Map.Entry<String, Integer> entry : personas.entrySet()) {
                dataOutput.writeUTF(entry.getKey());  // Escribir el nombre
                dataOutput.writeInt(entry.getValue()); // Escribir la edad
            }

            System.out.println("Datos guardados en " + archivo);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(archivo))) {
            while (dataInput.available() > 0) {
                String nombre = dataInput.readUTF();     // Leer el nombre
                int edad = dataInput.readInt();          // Leer la edad
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
