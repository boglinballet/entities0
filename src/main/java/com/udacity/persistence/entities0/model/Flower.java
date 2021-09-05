package com.udacity.persistence.entities0.model;

import javax.persistence.*;

@Entity
public class Flower extends Plant{
    private String color;

    public Flower() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
