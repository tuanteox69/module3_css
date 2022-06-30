package com.example.demo3;

import java.io.Serializable;

public class customer implements Serializable {

    String STT, Name;
    String date;
    String address;
    String img ;

    public customer() {
    }

    public customer(String STT, String name, String date, String address, String img) {
        this.STT = STT;
        Name = name;
        this.date = date;
        this.address = address;
        this.img = img;
    }

    public String getSTT() {
        return STT;
    }

    public void setSTT(String STT) {
        this.STT = STT;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
