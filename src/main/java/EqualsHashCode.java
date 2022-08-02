import java.util.HashMap;
import java.util.Map;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/27/2022 - 8:56 AM
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        Map<DataKey, Integer> hm = getAllData();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("java");
        System.out.println(dk.hashCode());
        Integer value = hm.get(dk);
        System.out.println(value);

    }

    private static Map<DataKey, Integer> getAllData() {
        Map<DataKey, Integer> hm = new HashMap<>();
        DataKey dk = new DataKey();
        dk.setId(1);
        dk.setName("java");
        System.out.println(dk.hashCode());
        hm.put(dk, 25);
        return hm;
    }
}
