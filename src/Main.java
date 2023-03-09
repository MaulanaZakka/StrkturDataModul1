

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double alas;
        double tinggi;
        System.out.println("Pilih 1 untuk Hasil Integer \nPilih 2 untuk Hasil double");
        int choice= sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Masukkan alas : ");
                alas = sc.nextDouble();
                System.out.print("Masukkan tinggi : ");
                tinggi = sc.nextDouble();

                Segitiga<Double> segitigaint = new Segitiga<>(alas, tinggi);
                System.out.println("Luas dengan int: " + segitigaint.getResultAsInt());
                break;
            case 2:
                System.out.print("Masukkan alas : ");
                alas = sc.nextDouble();
                System.out.print("Masukkan tinggi : ");
                tinggi = sc.nextDouble();

                Segitiga<Double> segitigadouble = new Segitiga<>(alas, tinggi);
                System.out.println("Luas dengan double : " + segitigadouble.getResultAsDouble());
                break;
            default:
                break;
        }
    }
}