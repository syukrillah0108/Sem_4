// Enkapsulasi
import java.util.Scanner;
public class Sepeda {
    String jenis;
    int TahunProduksi, gir;
    float harga;

    void setGir(int PertambahanGir){
        gir += PertambahanGir;
    }

    int getGir(){
        return gir;
    }

    public static void main(String[] args) {
        Sepeda S1 = new Sepeda();
        Sepeda S2 = new Sepeda();

        S1.gir = 30;
        S1.setGir(20);
        S1.jenis = "Of Road";
        S1.TahunProduksi = 2020;

        S2.gir = 15;
        S2.setGir(~30);
        S2.jenis = "Olahraga";
        S2.TahunProduksi = 2022;
        S2.harga = 25000.0F;

        System.out.println("\n=== Sepeda " + S1.jenis +  " ===");
        System.out.println("Gir \t:" + S1.getGir());
        System.out.println("Jenis \t:" + S1.jenis);
        System.out.println("Tahun \t:" + S1.TahunProduksi);

        System.out.println("\n=== Sepeda " + S2.jenis +  " ===");
        System.out.println("Gir \t:" + S2.getGir());
        System.out.println("Jenis \t:" + S2.jenis);
        System.out.println("Tahun \t:" + S2.TahunProduksi);
        System.out.println("Harga \t:" + S2.harga);
    }
    
}