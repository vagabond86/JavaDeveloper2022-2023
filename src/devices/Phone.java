package devices;

public class Phone extends Device {

    final Double screenSize;
    Boolean isAndroid;

    public Phone(Integer id, String producer, String model, Double screenSize) {
        super(id, producer, model);
        this.screenSize = screenSize;
    }
}

