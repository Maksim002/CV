package com.example.cv.model;

import android.widget.ImageView;

public class Model {

    private String name;
    private String title;
    private int image;
    private int icon;

    public Model(String name, String title, int image, int icon) {
        this.name = name;
        this.title = title;
        this.image = image;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
