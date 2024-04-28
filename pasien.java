package praktikum.uts;
import java.util.Scanner;
public class pasien{
    private String nama;
    private String gejala;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getGejala() {
        return gejala;
    }
    public void setGejala(String gejala) {
        this.gejala = gejala;
    }
    public void bacaInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Anda");
        nama = input.nextLine();
        System.out.println("Apa keluhan Anda");
        gejala = input.nextLine();
    }
}

// Interface untuk dokter
interface Dokter {
    void periksaPasien(pasien pasien);
    void berikanResep(pasien pasien);
}

// Class untuk dokter umum
class DokterUmum implements Dokter {

    @Override
    public void periksaPasien(pasien pasien) {
        System.out.println("Dokter umum memeriksa pasien " + pasien.getNama() + "...");
        // Lakukan pemeriksaan umum
    }

    @Override
    public void berikanResep(pasien pasien) {
        System.out.println("Dokter umum memberikan resep untuk pasien " + pasien.getNama() + "...");
        // Berikan resep umum
    }
}