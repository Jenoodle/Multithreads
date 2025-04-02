# Persiapan Pertemuan 15
collections framework || persiapan pertemuan 5 dan quiz

### Apa itu Mulltithreads?
- Multithread merupakan sebuah teknik pemrograman yang bekerja dengan cara membagi pekerjaan menjadi beberapa thread perangkat lunak untuk diproses secara bersamaan. Sekarang, sistem operasi tidak hanya bisa menjalani multiple progress tetapi dalam proses kita bisa menjalankan beberapa hingga banyak pekerjaan sekaligus, atau bisa dibilang juga dengan proses ringan (thread).
- Fungsi Multithread antara lain adalah, dapat meningkatkan respon dapada aplikasi yang melibatkan interaksi pengguna.
- Cara Kerja Multithread adalah dengan memisahkan tugas-tugas yang memakan waktu dari thread utama, sehingga antarmuka pengguna dapat tetap responsif dan tidak macet.

### Perbedaan Thread dan Runnable
Aspek	Thread	Runnable
Cara menggunakan	|| Mewarisi (extends) kelas Thread	Mengimplementasikan (implements) antarmuka Runnable
Tujuan	|| Digunakan jika ingin membuat Thread dengan kemampuan tambahan selain run()	Digunakan jika hanya perlu mengganti metode run() tanpa memodifikasi metode lain dalam Thread
Hubungan ||	Thread sendiri mengimplementasikan Runnable	Runnable adalah cara untuk membuat kelas dapat dieksekusi oleh thread tanpa mewarisi Thread
Struktur Kode	Harus meng-override metode run() dalam kelas Thread	Harus mengimplementasikan metode run() dari antarmuka Runnable
Cara Menjalankan	|| Membuat objek dari kelas Thread, lalu memanggil start()	Membuat objek Thread dengan Runnable sebagai parameter, lalu memanggil start()
Fleksibilitas	|| Kurang fleksibel karena langsung mewarisi Thread	Lebih fleksibel karena hanya menggunakan antarmuka
Keterbatasan ||	Tidak bisa mewarisi kelas lain karena Java tidak mendukung multiple inheritance	Bisa tetap mewarisi kelas lain karena hanya mengimplementasikan antarmuka
