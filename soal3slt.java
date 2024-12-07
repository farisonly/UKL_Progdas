import java.util.HashMap;

public class soal3slt {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        for (int num : array) {
            frekuensi.put(num, frekuensi.getOrDefault(num, 0) + 1);
        }

        frekuensi.forEach((key, value) -> System.out.println(key + " muncul " + value + " kali"));
    }
}