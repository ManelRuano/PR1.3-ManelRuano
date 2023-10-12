import java.io.*;

public class PR131mainEscriu {
    public static void main(String[] args) {
        PR131HashMap pr131HashMap = new PR131HashMap();
        pr131HashMap.getHashMap().put("Persona1", 25);
        pr131HashMap.getHashMap().put("Persona2", 30);
        pr131HashMap.getHashMap().put("Persona3", 28);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("PR131HashMapData.ser"))) {
            oos.writeObject(pr131HashMap);
            System.out.println("HashMap guardado en PR131HashMapData.ser.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
