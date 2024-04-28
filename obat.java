package praktikum.uts;

import java.util.ArrayList;
import java.util.List;

public class obat {  
    private String nama;
    private double harga;
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public obat(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public List<obat> obatList(){
            List<obat> daftarObat = new ArrayList<>();
            daftarObat.add(new obat("Paramex", 2000));
            daftarObat.add(new obat("Panadol Anak", 3500));
            daftarObat.add(new obat("Betadine Salep", 10000)); 
            daftarObat.add(new obat("Paracetamol", 15000));
            daftarObat.add(new obat("Fasidol", 15000));       

        for (obat obat : daftarObat) {
            System.out.println("\nNama: " + obat.getNama());
            System.out.println("Harga: " + obat.getHarga());
            System.out.println("----------------------");
        }
        return daftarObat;
    }
}

class obatanak extends obat {
    public obatanak(String nama, double harga) {
        super(nama, harga);
        List<obat> obatAnakList = obatList();

        for (obat obatAnak : obatAnakList) {
            double diskon = 0.15 * obatAnak.getHarga();
            System.out.println("Nama Obat Anak: " + obatAnak.getNama());
            System.out.println("Harga Obat Anak: " + obatAnak.getHarga());
            System.out.println("Diskon Obat Anak: " + diskon);
            System.out.println("----------------------");
            System.out.println("Harga akhir: " + (obatAnak.getHarga() - diskon)+"\n");
        }
        //TODO Auto-generated constructor stub
    }
}
