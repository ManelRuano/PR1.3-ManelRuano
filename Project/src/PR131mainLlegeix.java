import java.io.*;

public class PR131mainLlegeix {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("PR131HashMapData.ser"))) {
            PR131HashMap pr131HashMap = (PR131HashMap) ois.readObject();
            for (String nombre : pr131HashMap.getHashMap().keySet()) {
                int edad = pr131HashMap.getHashMap().get(nombre);
                System.out.println("Nombre: " + nombre + ", Edad: " + edad);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
