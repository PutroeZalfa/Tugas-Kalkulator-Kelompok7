# Aplikasi Kalkulator GUI (Java Swing)

Proyek aplikasi kalkulator berbasis grafis (Graphical User Interface) yang dikembangkan menggunakan bahasa pemrograman Java untuk memenuhi tugas kelompok mata kuliah Pemrograman Berorientasi Objek. Aplikasi ini menggunakan pustaka javax.swing dan dirancang dengan antarmuka yang bersih serta intuitif.

---

## Identitas Pengembang

Kelompok: 7

Anggota Kelompok:
- PutroeZalfa
- mirdhaauliazahraa

---

## Tujuan Proyek

1. Memenuhi tugas pembuatan aplikasi kalkulator berbasis Java.
2. Mengimplementasikan konsep Graphical User Interface (GUI) menggunakan Java Swing (JFrame, JPanel, JButton, JTextField).
3. Menerapkan penanganan kejadian (event handling) dan logika pemrograman berorientasi objek.

---

## Fitur Utama

- Operasi Aritmatika Dasar: Penjumlahan (+), pengurangan (-), perkalian (×), dan pembagian (÷).
- Fitur Tambahan:
  - Tombol AC (All Clear): Mereset seluruh perhitungan dan layar ke angka 0.
  - Tombol ⌫ (Backspace): Menghapus satu digit karakter terakhir.
  - Tombol %: Menghitung persentase nilai.
  - Tombol +/-: Mengubah tanda bilangan positif/negatif.
  - Tombol Koma (,): Mendukung input bilangan desimal.
- Penanganan Kesalahan: Validasi pencegahan kesalahan pembagian dengan angka nol.

---

## Teknologi yang Digunakan

- Bahasa Pemrograman: Java (JDK 8 atau versi terbaru)
- Pustaka GUI: Java Swing & AWT (javax.swing, java.awt)
- Pengembang: VS Code / IntelliJ IDEA / NetBeans
- Version Control: Git & GitHub

---

## Cara Instalasi dan Menjalankan Program

1. Clone repositori ini:
   git clone https://github.com/PutroeZalfa/Tugas-Kalkulator-Kelompok7.git
   cd Tugas-Kalkulator-Kelompok7

2. Kompilasi berkas sumber Java:
   javac Kalkulator.java

3. Jalankan aplikasi:
   java Kalkulator

---

## Contoh Penggunaan

### 1. Operasi Penjumlahan (15 + 25)

Langkah-langkah:
1. Klik tombol 1, lalu 5 (Layar menampilkan 15).
2. Klik tombol + (Menyimpan operator penjumlahan).
3. Klik tombol 2, lalu 5 (Layar menampilkan 25).
4. Klik tombol =.

Hasil Output pada Layar: 40

### 2. Operasi Pembagian dengan Nol (10 ÷ 0)

Langkah-langkah:
1. Klik tombol 1, lalu 0 (Layar menampilkan 10).
2. Klik tombol ÷.
3. Klik tombol 0.
4. Klik tombol =.

Hasil Output pada Layar: 0 (Mencegah penghentian paksa / crash program melalui mekanisme validasi).

---