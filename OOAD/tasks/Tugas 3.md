**Fungtional Requirements Specification (FRS)**

1. **Pengelolaan Harga Sewa Mobil:**

   - Sistem harus menyediakan daftar harga sewa mobil yang terperinci, termasuk harga sewa untuk setiap jenis kendaraan dan opsi penggunaan jasa sopir.
   - Penyewa harus dapat dengan mudah mengakses daftar harga sewa mobil melalui antarmuka sistem.
2. **Pengisian Formulir Penyewaan (FS):**

   - Sistem harus menyediakan formulir penyewaan (FS) yang harus diisi oleh penyewa.
   - Formulir penyewaan harus memuat informasi seperti identitas penyewa, jenis kendaraan yang disewa, tanggal dan durasi sewa, serta opsi penggunaan jasa sopir.
3. **Pembayaran di Muka:**

   - Sistem harus memungkinkan penyewa untuk melakukan pembayaran biaya sewa mobil di muka.
   - Setelah pembayaran dilakukan, sistem harus menghasilkan kwitansi pembayaran sebagai bukti pembayaran.
4. **Penerimaan Formulir Penyewaan dan Pembayaran:**

   - Petugas harus dapat menerima formulir penyewaan yang telah diisi oleh penyewa beserta pembayaran yang telah dilakukan.
   - Sistem harus dapat mengonfirmasi penerimaan formulir penyewaan dan pembayaran kepada penyewa.
5. **Pemeriksaan Kondisi Kendaraan:**

   - Petugas harus dapat melakukan pemeriksaan kondisi kendaraan saat pengembalian.
   - Sistem harus memberikan panduan kepada petugas untuk memeriksa kerusakan dan mencatatnya jika ditemukan.
6. **Pengisian Formulir Pengembalian (FR):**

   - Sistem harus menyediakan formulir pengembalian (FR) yang harus diisi jika terdapat kerusakan pada kendaraan saat pengembalian.
   - Formulir pengembalian harus mencatat detail kerusakan dan biaya penggantian yang dibebankan kepada penyewa.
7. **Denda Keterlambatan Pengembalian:**

   * Sistem harus menghitung dan mengenakan denda kepada penyewa jika mereka mengembalikan kendaraan melebihi waktu sewa yang telah ditentukan.
   * Besaran denda dan kebijakan keterlambatan harus jelas disampaikan kepada penyewa sebelum mereka melakukan penyewaan.
   * Sistem harus secara otomatis menghitung jumlah denda yang diperlukan dan menambahkannya ke total biaya sewa jika keterlambatan terjadi.
8. **Pengecekan Keadaan Kendaraan Tambahan:**

   * Petugas harus dapat melakukan pemeriksaan tambahan terhadap keadaan kendaraan selain kerusakan yang mungkin terjadi.
   * Pemeriksaan tambahan ini bisa termasuk mengukur tingkat bahan bakar, memeriksa kebersihan interior dan eksterior kendaraan, serta memastikan bahwa semua perlengkapan dan aksesori kendaraan ada dalam kondisi baik.
   * Sistem harus memungkinkan petugas untuk mencatat hasil pemeriksaan tambahan ini dan menyertakannya dalam laporan pengembalian.

**Non-Functional Requirements Specification (NFRS)**

| Quality Attribute      | Requirement Definition                       | How/Scope                                                             |
| ---------------------- | -------------------------------------------- | --------------------------------------------------------------------- |
| **Ketersediaan** | Sistem harus tersedia 24/7                   | Sistem di-host di server cloud dengan redundansi ganda                |
| **Keamanan**     | Data penyewa harus aman dan terenkripsi      | Data disimpan di database terenkripsi dengan akses kontrol yang ketat |
| **Kegunaan**     | Sistem harus mudah digunakan dan dinavigasi  | Antarmuka pengguna yang intuitif dan mudah dipahami                   |
| **Kinerja**      | Sistem harus responsif dan tidak lag         | Sistem dioptimalkan untuk performa dan skalabilitas                   |
| **Pemeliharaan** | Sistem harus mudah dipelihara dan diperbarui | Kode sumber yang terdokumentasi dengan baik dan modular               |
