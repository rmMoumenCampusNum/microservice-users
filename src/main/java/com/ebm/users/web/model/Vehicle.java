package com.ebm.users.web.model;

public class Vehicle {
    private String type;
    private float volumeCapacity;
    private int engineCapacityCm3;

    private int id;
    private String brand;
    private String model;
    private String color;
    private float base_price;
    private float km_price;
    private String matriculation;

    public Vehicle() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getVolumeCapacity() {
        return volumeCapacity;
    }

    public void setVolumeCapacity(float volumeCapacity) {
        this.volumeCapacity = volumeCapacity;
    }

    public int getEngineCapacityCm3() {
        return engineCapacityCm3;
    }

    public void setEngineCapacityCm3(int engineCapacityCm3) {
        this.engineCapacityCm3 = engineCapacityCm3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getBase_price() {
        return base_price;
    }

    public void setBase_price(float base_price) {
        this.base_price = base_price;
    }

    public float getKm_price() {
        return km_price;
    }

    public void setKm_price(float km_price) {
        this.km_price = km_price;
    }

    public String getMatriculation() {
        return matriculation;
    }

    public void setMatriculation(String matriculation) {
        this.matriculation = matriculation;
    }

    public String toString() {
        return "Vehicle{" +
                "type=" + type +
                "volumeCapacity=" + volumeCapacity +
                "engineCapacityCm3=" + engineCapacityCm3 +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", base_price=" + base_price +
                ", km_price=" + km_price +
                ", matriculation='" + matriculation + '\'' +
                '}';
    }
}
