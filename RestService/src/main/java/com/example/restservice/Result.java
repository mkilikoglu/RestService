package com.example.restservice;


import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result implements Serializable {

    private String sonucKodu;
    private String sonucAciklama;

    public Result(String sonucKodu, String sonucAciklama) {
        this.sonucKodu = sonucKodu;
        this.sonucAciklama = sonucAciklama;
    }
}
