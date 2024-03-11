package method;
import java.util.Scanner;

public class method3 {
    static void cetakBintang(int N) {
        if (N >= 1 && N <= 1000) {
            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N;

        System.out.print("Masukkan nilai N (1-1000): ");
        N = scanner.nextInt();

        if (N < 1 || N > 1000) {
            System.out.println("Nilai N harus antara 1 dan 1000.");
        } else {
            cetakBintang(N);
        }

        scanner.close();
    }
}
 