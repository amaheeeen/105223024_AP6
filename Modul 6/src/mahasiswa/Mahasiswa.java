package mahasiswa;

public class Mahasiswa {
    private String nama;
    private String NIM;

    // Konstruktor
    public Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }
    
    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk NIM
    public String getNIM() {
        return NIM;
    }
}