package devices;

public class Car extends Device {

    String color;
    public Double millage;
    Double engineVolume;
    String fuelType;
    Boolean KamilsProperty;

    public Car(Integer id, String producer, String model, String fuelType) {
        super(id, producer, model);
        this.fuelType = fuelType;
    }
}
