import java.io.Serializable;
import java.util.HashMap;

public class PR131HashMap implements Serializable {
    private HashMap<String, Integer> hashMap;

    public PR131HashMap() {
        hashMap = new HashMap<>();
    }

    public HashMap<String, Integer> getHashMap() {
        return hashMap;
    }

    public void agregarPersona(String nombre, int edad) {
        hashMap.put(nombre, edad);
    }

    public void eliminarPersona(String nombre) {
        hashMap.remove(nombre);
    }
}

