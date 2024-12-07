import java.util.Scanner; // bagian mengimpor

public class soal2mdh { //untuk menampung wadah
    public static void main(String[] args) { // metode main titik masuk(entry point)
        Scanner scanner = new Scanner(System.in); //membuat scanner untuk menginput data
        System.out.print("Masukkan bilangan: "); 
        int bilangan = scanner.nextInt();
        String hasil = (bilangan % 2 == 0) ? "Genap" : "Ganjil"; 
        System.out.println("Bilangan tersebut adalah: " + hasil); 
        scanner.close();
    }
}