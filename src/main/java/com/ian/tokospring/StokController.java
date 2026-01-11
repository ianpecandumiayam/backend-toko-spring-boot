package com.ian.tokospring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Map;

@RestController
public class StokController {
    @Autowired
    private JdbcTemplate db;

    @GetMapping("/api/stok")
    public List<Map<String, Object>> ambilSemuaBarang() {
         String sql = "SELECT barang.namabar, barang.harga, kategori.nama_kategori " +
                     "FROM barang LEFT JOIN kategori ON barang.id_kategori = kategori.id";

        return db.queryForList(sql);
    }
}
