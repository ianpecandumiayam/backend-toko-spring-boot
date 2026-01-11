# Backend Toko Spring Boot 

Ini adalah evolusi dari proyek Backend Toko. Migrasi dari Java Native (HttpServer) ke **Spring Boot Framework** untuk performa dan kemudahan development.

Project ini mensimulasikan REST API sederhana untuk manajemen stok barang menggunakan database SQLite.

## Teknologi
- **Bahasa:** Java (JDK 17)
- **Framework:** Spring Boot 3.x
- **Build Tool:** Gradle (Groovy)
- **Database:** SQLite
- **Driver:** JDBC Template & SQLite JDBC

## Fitur
- **REST API Modern:** Response JSON otomatis tanpa parsing manual.
- **Database Connection:** Terhubung ke SQLite menggunakan `JdbcTemplate`.
- **Relasi Data:** Menampilkan data hasil `JOIN` tabel Barang & Kategori.
- **Embedded Server:** Jalan langsung di port 8080 (Tomcat).

## Cara Menjalankan (Linux/Terminal)

**Syarat:** Wajib terinstall **Java 17** atau lebih baru.

1. **Clone Repository**
   ```bash
   git clone [https://github.com/ianpecandumiayam/backend-toko-spring-boot.git](https://github.com/ianpecandumiayam/backend-toko-spring-boot.git)
   cd backend-toko-spring-boot
2. **Jalankan Aplikasi Menggunakan Gradle Wrapper (tidak perlu install Gradle manual):**
   ```bash
   ./gradlew bootRun
3. **Test API Buka terminal baru dan jalankan:**
   # Cek kesehatan server
   ```bash
   curl http://localhost:8080/api/halo
   ```
   # Ambil data stok (Database)
   ```bash
   curl http://localhost:8080/api/stok
   ```
**Dibuat oleh:** ianpecandumiayam
