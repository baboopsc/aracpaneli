package com.aracpaneli.aracpaneli;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnaController {

    @GetMapping("/")
    public String anaSayfa() {
        return "Araç Paneli Çalışıyor!";
    }
}
