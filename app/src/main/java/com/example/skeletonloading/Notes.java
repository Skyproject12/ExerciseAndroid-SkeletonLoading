package com.example.skeletonloading;

public class Notes {
    private String title;
    private String deskripsi;
    private int gambar;

    public Notes(String title, String deskripsi, int gambar) {
        this.title = title;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
