package com.example.uas;

import android.graphics.drawable.Drawable;

public class Food {
    String nama;
    String deskripsi;
    int harga;
    Drawable image;

    public Food(String nama, String deskripsi, int harga, Drawable image) {
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}

