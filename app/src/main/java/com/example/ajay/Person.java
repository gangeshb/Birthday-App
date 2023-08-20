package com.example.ajay;

public class Person {
    String Des;
    int Image;
    String Name;

    public Person(int i, String str, String str2) {
        this.Image = i;
        this.Name = str;
        this.Des = str2;
    }

    public int getImage() {
        return this.Image;
    }

    public void setImage(int i) {
        this.Image = i;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String str) {
        this.Name = str;
    }

    public String getDes() {
        return this.Des;
    }

    public void setDes(String str) {
        this.Des = str;
    }
}
