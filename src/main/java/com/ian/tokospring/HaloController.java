package com.ian.tokospring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HaloController {

    @GetMapping("/api/halo")
    public Map<String, Object> sapaBos() {
        Map<String, Object> data = new HashMap<>();
        data.put("status", "sukses");
        data.put("pesan", "Halo Ian, ini Spring Boot!");
        return data;
    }
}
