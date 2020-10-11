package tugas2;

public class AlasSisi extends Segitiga {
    int alas, sisi;

    public AlasSisi(int alas, int sisi) {
        super(alas, sisi);
        this.alas = alas;
        this.sisi = sisi;
    }

    public int getAlas() {
        return alas;
    }

    public int getSisi() { return sisi; }

    public double getTinggi() {
        return (getSisi()) / 2f * Math.sqrt(3);
    }

    @Override
    public void luas() {
        double luas = (getAlas() * getTinggi()) / 2f;
        System.out.println("Luas Segitiga Sama Sisi Adalah : " + luas);
    }

    @Override
    public void keliling() {
        double keliling = 3 * getSisi();
        System.out.println("Keliling Segitiga Sama Kaki Adalah : " + keliling);
    }
}
