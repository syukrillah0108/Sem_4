import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) {
        // Nama file yang akan ditulis
        String fileName = "filename.txt";
        // Konten yang akan ditambahkan ke file
        String content = "baris satu\nbaris dua";

        try {
            // Membuat objek FileWriter dengan mode append (true)
            FileWriter myWriter = new FileWriter(fileName, true);
            // Menulis konten ke file dengan tambahan baris baru
            myWriter.write(content + System.lineSeparator());
            // Menutup FileWriter untuk memastikan semua data tersimpan
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            // Menangkap dan menampilkan pesan kesalahan jika terjadi IOException
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
