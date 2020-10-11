package tugas2;

public class AlasTinggi extends Segitiga {
    int alas, tinggi;

    public AlasTinggi(int alas, int tinggi) {
        super(alas, tinggi);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public void luas() {
        double luas = (getAlas() * getTinggi()) / 2f;
        System.out.println("Luas Segitiga Sama Sisi Adalah : " + luas);
    }

    @Override
    public void keliling() {
        double keliling = 3 * getAlas();
        System.out.println("Keliling Segitiga Sama Kaki Adalah : " + keliling);
    }
}
