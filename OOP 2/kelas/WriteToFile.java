import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "bari satu.\n"
                       + "Ini adalah contoh cara menulis file teks di Java.";

        try {
            // Membuat objek FileWriter
            FileWriter fileWriter = new FileWriter(filePath);
            // Membungkus FileWriter dengan BufferedWriter
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Menulis konten ke file
            bufferedWriter.write(content);

            // Menutup BufferedWriter
            bufferedWriter.close();

            System.out.println("Berhasil menulis ke file " + filePath);
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis ke file: " + e.getMessage());
        }
    }
}
