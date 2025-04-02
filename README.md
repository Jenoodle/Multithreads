# Persiapan Pertemuan 15
collections framework || persiapan pertemuan 5 dan quiz

### 1. Apa itu Mulltithreads?
- Multithread merupakan sebuah teknik pemrograman yang bekerja dengan cara membagi pekerjaan menjadi beberapa thread perangkat lunak untuk diproses secara bersamaan. Sekarang, sistem operasi tidak hanya bisa menjalani multiple progress tetapi dalam proses kita bisa menjalankan beberapa hingga banyak pekerjaan sekaligus, atau bisa dibilang juga dengan proses ringan (thread).
- Fungsi Multithread antara lain adalah, dapat meningkatkan respon dapada aplikasi yang melibatkan interaksi pengguna.
- Cara Kerja Multithread adalah dengan memisahkan tugas-tugas yang memakan waktu dari thread utama, sehingga antarmuka pengguna dapat tetap responsif dan tidak macet.

### 2. Perbedaan Thread dan Runnable
Thread | Runable
*Cara menggunakan* :
Thread : Mewarisi kelas Thread 
Runnable: Mengimplementasikan antarmuka Runnable

*Tujuan*	
Thread: Digunakan saat ingin membuat Thread dengan kemampuan tambahan selain run() 
Runnable: Digunakan jika hanya perlu mengganti metode run() tanpa modifikasi metode lain

*Hubungan*
Thread : mengimplementasikan Runnable	
runnable: cara untuk membuat kelas dieksekusi oleh thread tanpa mewarisi Thread-nya
--------------------------------------------------------------------------------------------------------------------------------------------------------------
*Cara Menjalankan*	: 
Thread: Membuat objek dari kelas Thread, lalu memanggil start() 
Runnable: Membuat objek Thread dengan Runnable sebagai parameter, lalu memanggil start()
----------------------------------------------------------------------------------------------------------------------------------
*Keterbatasan* 
Thread: Tidak bisa mewarisi kelas lain karena tidak mendukung multiple inheritance 
Runnable: Dapat mewarisi kelas lain 


### 3. Penggunaan Thread.sleep()
Thread.sleep() : metode dalam Java yang digunakan untuk memberikan jeda atau menunda eksekusi sebuah thread dalam satuan milidetik (1.000 milidetik = 1 detik).

Fungsi : Untuk mengontrol eksekusi multithreading agar dapat mengatur thread mana yang akan dijalankan lebih dahulu sebelum thread lainnya ikut dijalankan. 
Thread.sleep() dapat membantu proses loading.
