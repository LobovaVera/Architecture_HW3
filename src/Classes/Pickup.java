package Classes;

import java.awt.*;

public class Pickup extends Car implements iRefuelling {
    private int loadCapacity;
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }


    public Pickup(String manufacturer,
                  String model,
                  Color color,
                  TypeCar bodyType,
                  int numberWheels,
                  TypeFuel fuel)
    {
        super(manufacturer, model, color, bodyType, numberWheels, fuel);
    }

    @Override
    public int gearShifting(int gearPosition) {
        return 0;
    }

    @Override
    public void fuel() {

    }
}
