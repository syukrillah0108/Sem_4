# SYUKRILLAH (22552011247)
# PERHITUNGAN PEMBIAYAAN
### 1. Menghitung Unadjusted Use Case Points (UUCP)
```markdown
UUCP = Unadjusted Actor Weight (UAW) + Unadjusted Use Case Weight (UUCW)
```
- UAW dihitung berdasarkan klasifikasi aktor (simple, average, complex).
- UUCW dihitung berdasarkan klasifikasi use case (simple, average, complex).

### 2. Menghitung Technical Complexity Factor (TCF)
```markdown
TCF = 0.6 + (0.01 * ΣTFi)
```
- TFi adalah faktor teknis yang dipengaruhi oleh berbagai aspek teknis (misalnya, sistem distribusi, respon waktu, dll).

### 3. Menghitung Environmental Complexity Factor (ECF)
```markdown
ECF = 1.4 + (-0.03 * ΣEFi)
```
- EFi adalah faktor lingkungan yang dipengaruhi oleh berbagai aspek lingkungan pengembangan (misalnya, pengalaman tim, kemampuan analisis, dll).

### 4. Menghitung Use Case Points (UCP)
```markdown
UCP = UUCP * TCF * ECF
```

### 5. Menghitung Estimasi Effort (Hours of Effort)
```markdown
Estimasi Effort = UCP * Effort Rate (ER)
```
- Effort Rate (ER) adalah konstanta yang mewakili jumlah jam kerja yang dibutuhkan per use case point. Dalam dokumen ini, ER = 8.2.

### 6. Menghitung Estimasi Biaya Proyek
```markdown
Biaya Total = Estimasi Effort * Tarif per Jam
```
- Tarif per Jam ditentukan berdasarkan standar gaji yang ditetapkan untuk setiap peran dalam proyek.

# PEDOMAN ALOKASI SDM
1. Identifikasi Kebutuhan SDM

    Langkah: Tentukan peran dan jumlah tenaga kerja yang dibutuhkan berdasarkan lingkup proyek.
    Peran Umum:
        Project Manager
        Software Developer
        Quality Assurance (QA)
        System Analyst
        UI/UX Designer
        Technical Writer

2. Estimasi Waktu dan Tugas

    Langkah: Alokasikan waktu untuk setiap tugas berdasarkan estimasi effort (hours of effort).
    Rumus:

    markdown

    Waktu (Jam) = Estimasi Effort / Jumlah SDM

3. Pembagian Tugas Berdasarkan Keahlian

    Langkah: Sesuaikan tugas dengan keahlian masing-masing anggota tim.
    Contoh:
        Software Developer: Pengembangan kode, debugging.
        QA: Pengujian perangkat lunak, dokumentasi hasil pengujian.
        UI/UX Designer: Desain antarmuka, pengalaman pengguna.

4. Monitoring dan Evaluasi

    Langkah: Lakukan monitoring berkala untuk memastikan alokasi SDM berjalan sesuai rencana.
    Indikator:
        Persentase penyelesaian tugas
        Kepatuhan terhadap jadwal
        Kualitas hasil kerja

5. Penyesuaian Alokasi SDM

    Langkah: Lakukan penyesuaian jika ada perubahan dalam proyek.
    Faktor:
        Perubahan lingkup proyek
        Keterlambatan atau percepatan jadwal
        Perubahan prioritas tugas

Tabel Alokasi SDM

Berikut adalah contoh tabel alokasi SDM:

markdown

| Peran               | Jumlah SDM | Tugas                                      | Waktu (Jam)   |
|---------------------|------------|--------------------------------------------|---------------|
| Project Manager     | 1          | Koordinasi proyek, rapat, monitoring       | 100           |
| Software Developer  | 3          | Pengembangan kode, debugging               | 300           |
| Quality Assurance   | 2          | Pengujian perangkat lunak, dokumentasi     | 200           |
| System Analyst      | 1          | Analisis sistem, requirement gathering     | 100           |
| UI/UX Designer      | 1          | Desain antarmuka, pengalaman pengguna      | 80            |
| Technical Writer    | 1          | Dokumentasi teknis, panduan pengguna       | 60            |

Contoh Alokasi Tugas

markdown

1. **Project Manager**
   - Koordinasi proyek: 40 jam
   - Rapat: 30 jam
   - Monitoring: 30 jam

2. **Software Developer**
   - Pengembangan kode: 200 jam
   - Debugging: 100 jam

3. **Quality Assurance**
   - Pengujian perangkat lunak: 150 jam
   - Dokumentasi hasil pengujian: 50 jam

4. **System Analyst**
   - Analisis sistem: 60 jam
   - Requirement gathering: 40 jam

5. **UI/UX Designer**
   - Desain antarmuka: 50 jam
   - Pengalaman pengguna: 30 jam

6. **Technical Writer**
   - Dokumentasi teknis: 40 jam
   - Panduan pengguna: 20 jam

# PEDOMAN PENGENDALIAN ALOKASI PEMBIAYAAN
1. Perencanaan Anggaran

    Langkah: Buat rencana anggaran yang detail untuk setiap tahap proyek.
    Komponen Anggaran:
        Pengembangan: Gaji SDM, perangkat lunak, perangkat keras.
        Operasional: Sewa, utilitas, biaya komunikasi.
        Pemeliharaan: Biaya perawatan dan dukungan setelah peluncuran.

markdown

| Komponen          | Rincian                          | Biaya       |
|-------------------|----------------------------------|-------------|
| Pengembangan      | Gaji SDM, perangkat lunak, perangkat keras | Rp XXX     |
| Operasional       | Sewa, utilitas, biaya komunikasi | Rp XXX     |
| Pemeliharaan      | Perawatan dan dukungan           | Rp XXX     |
| **Total**         |                                  | Rp XXX     |

2. Pemantauan Pengeluaran

    Langkah: Lakukan pemantauan pengeluaran secara berkala untuk memastikan sesuai dengan anggaran yang telah direncanakan.
    Metode Pemantauan:
        Laporan Keuangan Bulanan: Rekapitulasi semua pengeluaran bulanan.
        Reviu Mingguan: Evaluasi mingguan terhadap pengeluaran.

3. Pembandingan dengan Anggaran

    Langkah: Bandingkan pengeluaran aktual dengan anggaran yang telah ditetapkan.
    Rumus:

    markdown

Selisih = Anggaran - Pengeluaran Aktual

Contoh:

markdown

    Anggaran = Rp 100,000,000
    Pengeluaran Aktual = Rp 90,000,000
    Selisih = Rp 10,000,000

4. Analisis Varians

    Langkah: Identifikasi dan analisis varians antara anggaran dan pengeluaran aktual.
    Tindakan:
        Positive Variance: Pengeluaran di bawah anggaran. Identifikasi penyebab efisiensi.
        Negative Variance: Pengeluaran di atas anggaran. Cari penyebab dan lakukan penyesuaian.

markdown

| Komponen          | Anggaran   | Pengeluaran Aktual | Varians    |
|-------------------|------------|--------------------|------------|
| Pengembangan      | Rp 50,000,000 | Rp 45,000,000       | Rp 5,000,000 (Positive)  |
| Operasional       | Rp 30,000,000 | Rp 35,000,000       | Rp -5,000,000 (Negative) |
| Pemeliharaan      | Rp 20,000,000 | Rp 18,000,000       | Rp 2,000,000 (Positive)  |
| **Total**         | Rp 100,000,000 | Rp 98,000,000       | Rp 2,000,000 (Positive)  |

5. Pengendalian Biaya

    Langkah: Lakukan tindakan pengendalian untuk menjaga pengeluaran sesuai anggaran.
    Strategi:
        Optimalisasi Sumber Daya: Penggunaan sumber daya secara efisien.
        Negosiasi Ulang Kontrak: Negosiasi dengan vendor untuk menurunkan biaya.
        Penjadwalan Ulang Tugas: Menunda atau menyebarkan tugas untuk mengurangi biaya segera.

6. Pelaporan dan Evaluasi

    Langkah: Buat laporan pengeluaran dan evaluasi secara berkala untuk manajemen.
    Komponen Laporan:
        Ringkasan Pengeluaran: Total pengeluaran dibandingkan dengan anggaran.
        Analisis Varians: Penjelasan tentang varians dan tindakan yang diambil.
        Rekomendasi: Saran untuk perbaikan di masa mendatang.

markdown

# Laporan Pengeluaran Proyek

## Ringkasan Pengeluaran
| Komponen          | Anggaran   | Pengeluaran Aktual | Varians    |
|-------------------|------------|--------------------|------------|
| Pengembangan      | Rp 50,000,000 | Rp 45,000,000       | Rp 5,000,000 (Positive)  |
| Operasional       | Rp 30,000,000 | Rp 35,000,000       | Rp -5,000,000 (Negative) |
| Pemeliharaan      | Rp 20,000,000 | Rp 18,000,000       | Rp 2,000,000 (Positive)  |
| **Total**         | Rp 100,000,000 | Rp 98,000,000       | Rp 2,000,000 (Positive)  |

## Analisis Varians
- **Pengembangan:** Efisiensi dalam penggunaan sumber daya.
- **Operasional:** Kenaikan biaya utilitas yang tidak terduga.
- **Pemeliharaan:** Optimalisasi biaya perawatan.

## Rekomendasi
- Lanjutkan pemantauan ketat pada biaya operasional.
- Cari solusi alternatif untuk mengurangi biaya utilitas.
- Pertimbangkan kontrak jangka panjang dengan vendor untuk mendapatkan harga lebih baik.