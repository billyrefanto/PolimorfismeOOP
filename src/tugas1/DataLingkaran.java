package tugas1;

public class DataLingkaran {
    static final double PI = 3.14;

    public static void showLuas (float jejari){
        System.out.println("Luas lingkaran : " + PI * Math.pow(jejari,2));

    }
    public static void showLuas (double diameter){
        System.out.println("Luas lingkaran : " + (PI * Math.pow(diameter,2))/4);

    }
    public static void showKeliling (float jejari){
        System.out.println("keliling lingkaran : " + 2 * PI *jejari);

    }
    public static void showKeliling (double diameter){
        System.out.println("keliling lingkaran : " + PI * diameter);

    }
}
