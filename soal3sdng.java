import java.util.Random;
import java.util.Scanner;

public class soal3sdng {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        do {
            int a = r.nextInt(10) + 1, b = r.nextInt(10) + 1;
            String op = switch (r.nextInt(3)) { case 0 -> "*"; case 1 -> "/"; default -> "%"; };
            int res = switch (op) { case "*" -> a * b; case "/" -> a / b; default -> a % b; };
            System.out.print(a + " " + op + " " + b + " = ");
            System.out.println(s.nextInt() == res ? "Benar!" : "Salah. Hasil: " + res);
            System.out.print("Lanjut? (ya/tidak): ");
        } while (s.next().equalsIgnoreCase("ya"));
        s.close();
    }
}