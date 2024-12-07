import java.util.HashSet;

public class soal2slt {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5}; //membuat dan nilai awal array
        HashSet<Integer> set = new HashSet<>();

        for (int num : array) { //ulang
            if (!set.add(num)) { //meriksa
                System.out.println("Array memiliki elemen duplikat: " + num); //nampil pesann
                return; // Keluar setelah menemukan duplikat pertama
            }
        }
        System.out.println("Array tidak memiliki elemen duplikat."); 
    }
}