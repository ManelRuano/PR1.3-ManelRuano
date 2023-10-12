import java.io.*;
import java.util.ArrayList;

public class PR132main {
    public static void main(String[] args) {
        // Crear objetos PR132persona con los datos proporcionados
        PR132persona persona1 = new PR132persona("Maria", "López", 36);
        PR132persona persona2 = new PR132persona("Gustavo", "Ponts", 63);
        PR132persona persona3 = new PR132persona("Irene", "Sales", 54);

        // Crear una lista para almacenar las personas
        ArrayList<PR132persona> personas = new ArrayList<>();
        personas.add(persona1);
        personas.add(persona2);
        personas.add(persona3);

        // Escribir la lista de personas en el archivo "PR132people.dat"
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PR132people.dat"))) {
            oos.writeObject(personas);
            System.out.println("Personas guardadas en PR132people.dat.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Leer el archivo "PR132people.dat" y mostrar la información
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PR132people.dat"))) {
            ArrayList<PR132persona> personasLeidas = (ArrayList<PR132persona>) ois.readObject();
            for (PR132persona persona : personasLeidas) {
                System.out.println(persona.toString());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
