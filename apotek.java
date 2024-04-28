package praktikum.uts;
import java.util.Scanner;

public class apotek{
    public static void main(String[] args) {
        pasien pasien1 = new pasien();
        pasien1.bacaInput();
        pasien pasien2 = new pasien();
        pasien2.bacaInput();
        System.out.println("Pasien 1: " + pasien1.getNama() + " - Gejala: " + pasien1.getGejala());
        System.out.println("Pasien 2: " + pasien2.getNama() + " - Gejala: " + pasien2.getGejala());

        obat listObat = new obat(null, 0);
        listObat.obatList();
        Scanner input = new Scanner(System.in);
        System.out.println("Apakah mau membeli obat?");
        String pilih = input.nextLine().trim();
        if(pilih.equalsIgnoreCase("ya")|| pilih.equalsIgnoreCase("y")){  
            System.out.println("Apakah obat ini untuk anak kecil?");
            String anak = input.nextLine();
            if(anak.equalsIgnoreCase("ya")|| anak.equalsIgnoreCase("y")){
                System.out.println("Mau pilih obat apa?");
                obatanak obatAnakList = new obatanak(null, 0);
            }else{
                Dokter dokterUmum = new DokterUmum();
                dokterUmum.periksaPasien(pasien1);
                dokterUmum.berikanResep(pasien1);
                dokterUmum.periksaPasien(pasien2);
                dokterUmum.berikanResep(pasien2);
            }
            
        }else{
            System.out.println("Eror!!");
        }
    }
}