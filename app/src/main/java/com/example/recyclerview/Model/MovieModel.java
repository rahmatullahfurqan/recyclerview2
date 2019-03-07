package com.example.recyclerview.Model;

import android.graphics.drawable.Drawable;

public class MovieModel {
    String name;//deklarasi stirng name
    int gambar;//deklarasi int gambar, karna data yg di simpan bukan string tetapi int dari lokasi gambar
    String overview;



    public MovieModel(String name, int gambar, String overview) { // constructor menerima name sama drawable gambar
        this.name = name;
        this.gambar = gambar;
        this.overview = overview;
    }

    public int getGambar() { //get data gambar dlam bentuk drawable
        return gambar;
    }

    public String getName() { // get data name dalam bentuk stirng
        return name;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
}
