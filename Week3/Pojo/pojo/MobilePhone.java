package com.example.pojo;

public class MobilePhone {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;
    private int providedyear;
    private String model;
    private String cityProvided;

    public int getProvidedyear() {
        return providedyear;
    }

    public void setProvidedyear(int providedyear) {
        this.providedyear = providedyear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCityProvided() {
        return cityProvided;
    }

    public void setCityProvided(String cityProvided) {
        this.cityProvided = cityProvided;
    }

    public String getModel(String model) {
        return model;
    }
}
