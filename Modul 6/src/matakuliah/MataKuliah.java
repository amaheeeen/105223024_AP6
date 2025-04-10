package matakuliah;

import dosen.Dosen;
import mahasiswa.Mahasiswa;
import java.util.ArrayList;

public class MataKuliah {
    private String nama;
    private String KodeMK;
    private ArrayList<Dosen> pengampu;
    private ArrayList<Mahasiswa> daftarMahasiswa;

    // Konstruktor untuk inisialisasi nama dan KodeMK
    public MataKuliah(String nama, String KodeMK) {
        this.nama = nama;
        this.KodeMK = KodeMK;
    }

    // Setter untuk daftarMahasiswa
    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    // Setter untuk pengampu
    public void setPengampu(ArrayList<Dosen> pengampu) {
        this.pengampu = pengampu;
    }

    // Getter untuk semua attribute
    public String getNama() {
        return nama;
    }

    public String getKodeMK() {
        return KodeMK;
    }

    public ArrayList<Dosen> getPengampu() {
        return pengampu;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }
}