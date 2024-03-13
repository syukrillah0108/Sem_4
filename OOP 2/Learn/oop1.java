import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class oop1 {
    public static void main(String[] args) {
        String namaFile = "file.txt";

        try {
            // Membuka file
            FileReader fileReader = new FileReader(namaFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Membaca isi file baris per baris
            String baris;
            while ((baris = bufferedReader.readLine()) != null) {
                System.out.println(baris);
            }

            // Menutup file setelah selesai membacanya
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }
}