package method;
import java.util.Scanner;

public class method2 {
    static void cetakPrimaDanKomposit(int batasAwal, int batasAkhir) {
        System.out.println("Bilangan prima " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (isPrima(i)) {
                System.out.print(i + " ");
            } else {
                System.out.print("");
            }
        }
        System.out.println();

        System.out.println("Bilangan komposit " + batasAwal + " sd " + batasAkhir + " adalah:");
        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (!isPrima(i) && i != 1) {
                System.out.print(i + " ");
            } else {
                System.out.print("");
            }
        }
    }
    
    static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        } else {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas awal: ");
        int batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        int batasAkhir = input.nextInt();

        cetakPrimaDanKomposit(batasAwal, batasAkhir);
    }
}
