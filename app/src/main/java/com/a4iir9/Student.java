package com.a4iir9;

import android.graphics.Bitmap;

public class Student {
    private Long id;
    private String name;
    private String surname;
    private String classe;
    private String phone;
    private Bitmap image;


    public Student(Long id, String name, String surname, Bitmap image, String classe, String phone) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.image = image;
        this.classe = classe;
        this.phone = phone;

    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Bitmap getImage() {
        return image;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }
}
