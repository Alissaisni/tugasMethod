package method;
import java.util.Scanner;

public class method1 {
    static void checkRibuan(int angka1, int angka2, int angka3) {
        String[] namaBil = {"pertama", "kedua", "ketiga"};
        int[] angka = {angka1, angka2, angka3};

        for (int i = 0; i < angka.length; i++) {
            if (angka[i] >= 1000) {
                System.out.println("Bilangan " + namaBil[i] + " adalah ribuan");
            } else {
                System.out.println("Bilangan " + namaBil[i] + " adalah bukan ribuan");
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] angka = new int[3];

        String[] namaBil = {"pertama", "kedua", "ketiga"};

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Masukkan bilangan " + namaBil[i] + ": ");
            angka[i] = scanner.nextInt();
        }

        checkRibuan(angka[0], angka[1], angka[2]);

        scanner.close();
    }
}
