package Classes;

import java.awt.*;

public abstract class Car {
    private String manufacturer;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private int numberWheels;
    private TypeFuel fuel;

    private TypeGearbox gear;
    private float engineCapacity;


    public Car(String manufacturer,
               String model,
               Color color,
               TypeCar bodyType,
               int numberWheels,
               TypeFuel fuel) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberWheels = numberWheels;
        this.fuel = fuel;

    }
public void movement(){

}

public void maintenance(){

}


public abstract int gearShifting(int gearPosition);
    public String getMake() {
        return manufacturer;
    }

    public void setMake(String make) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
 public boolean headLights(){
        return true;
 }
 public boolean wipers(){
        return true;
 }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public int getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(int numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }



}