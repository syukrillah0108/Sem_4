import java.util.Hashtable;
import java.util.Dictionary;
import java.util.Enumeration;

public class hashtab {
    public static void main(String[] args) {
        Hashtable<String, Integer> tabel = new Hashtable<>();
        tabel.put("A", 100);
        tabel.put("B", 75);
        tabel.put("C", 50);
        tabel.put("D", 25);

        System.out.println(tabel.get("A"));
        Enumeration<String> keys = tabel.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key);
        }
    }
}
