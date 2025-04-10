package utama;

import dosen.Dosen;  // Perhatikan huruf kecil 'm' di matakuliah
import java.util.ArrayList;
import mahasiswa.Mahasiswa;
import matakuliah.MataKuliah;

public class Utama {
    public static void main(String[] args) {
        // Membuat objek Dosen
        Dosen cahya = new Dosen("Cahya", "NIDN001");
        Dosen budi = new Dosen("Budi", "NIDN002");
        
        // Membuat objek Mahasiswa
        Mahasiswa tiara = new Mahasiswa("Tiara", "NIM001");
        Mahasiswa diana = new Mahasiswa("Diana", "NIM002");
        
        // Membuat list mahasiswa untuk PBO dan Kompar
        ArrayList<Mahasiswa> mahasiswaPBO = new ArrayList<>();
        mahasiswaPBO.add(tiara);
        mahasiswaPBO.add(diana);
        
        ArrayList<Mahasiswa> mahasiswaKompar = new ArrayList<>();
        mahasiswaKompar.add(tiara);
        mahasiswaKompar.add(diana);
        
        // Membuat list pengampu
        ArrayList<Dosen> pengampuPBO = new ArrayList<>();
        pengampuPBO.add(cahya);
        
        ArrayList<Dosen> pengampuKompar = new ArrayList<>();
        pengampuKompar.add(budi);
        
        // Membuat objek MataKuliah
        MataKuliah pbo = new MataKuliah("PBO", "123");
        pbo.setPengampu(pengampuPBO);
        pbo.setDaftarMahasiswa(mahasiswaPBO);
        
        MataKuliah kompar = new MataKuliah("Kompar", "124");
        kompar.setPengampu(pengampuKompar);
        kompar.setDaftarMahasiswa(mahasiswaKompar);
        
        // Memanggil method tampilkanData
        System.out.println("Data Mata Kuliah:");
        tampilkanData(pbo);
        tampilkanData(kompar);
    }
    
    // Method static untuk menampilkan data
    public static void tampilkanData(MataKuliah matakuliah) {
        System.out.println("\nMata Kuliah: " + matakuliah.getNama());
        System.out.println("Kode Mata Kuliah: " + matakuliah.getKodeMK());
        
        System.out.println("Pengampu:");
        for (Dosen dosen : matakuliah.getPengampu()) {
            System.out.println("- " + dosen.getNama() + " (NIDN: " + dosen.getNIDN() + ")");
        }
        
        System.out.println("Mahasiswa:");
        for (Mahasiswa mhs : matakuliah.getDaftarMahasiswa()) {
            System.out.println("- " + mhs.getNama() + " (NIM: " + mhs.getNIM() + ")");
        }
    }
}