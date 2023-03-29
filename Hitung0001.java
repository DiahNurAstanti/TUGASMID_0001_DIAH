import java.util.Scanner;

public class Hitung0001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan mil: ");
        double mil = input.nextDouble();

        double meter = mil * 1609;

        System.out.println("Hasil " + mil + " mil = " + meter + " meter");
    }
}
