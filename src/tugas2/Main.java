package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilih, alas;
        do {
            System.out.println(
                    "=============[Pilih Menu]============ \n" +
                    "1.Menghitung Segitiga Alas dan Sisi\n" +
                    "2.Menghitung Segitiga Alas dan Tinggi\n" +
                    "3.Keluar\n" +
                    "=====================================");
            System.out.print("Pilih : ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Alas : ");
                    alas = scanner.nextInt();
                    System.out.print("Masukkan Sisi : ");
                    int sisi = scanner.nextInt();

                    AlasSisi alasSisi = new AlasSisi(alas, sisi);
                    alasSisi.luas();
                    alasSisi.keliling();
                    break;
                case 2:
                    System.out.print("Masukkan Alas : ");
                    alas = scanner.nextInt();
                    System.out.print("Masukkan Tinggi : ");
                    int tinggi = scanner.nextInt();

                    AlasTinggi alasTinggi = new AlasTinggi(alas, tinggi);
                    alasTinggi.luas();
                    alasTinggi.keliling();
                    break;
                case 3:
                    System.out.println("Keluar");
                    return;
            }
        } while (true);
    }
}
