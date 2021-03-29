package com.example.wsr44;

public class feeling {

    private int id;
    private String title;
    private String image;
    private String position;

    public int getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getPosition() {
        return position;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
