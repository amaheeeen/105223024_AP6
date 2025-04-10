package dosen;

public class Dosen {
    private String nama;
    private String NIDN;

    // Konstruktor
    public Dosen(String nama, String NIDN) {
        this.nama = nama;
        this.NIDN = NIDN;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NIDN
    public String getNIDN() {
        return NIDN;
    }
}