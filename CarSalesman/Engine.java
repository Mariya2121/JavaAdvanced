package CarSalesman;

public class Engine {
    private String model;
    private int power;
    private String displacement;
    private String efficiently;

    public Engine(String model, int power, String displacement, String efficiently) {
        this.model = model;
        this.power = power;
        this.displacement = displacement;
        this.efficiently = efficiently;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.efficiently = "n/a";
        this.displacement = "n/a";
    }

    public Engine(String model, int power, String type) {
        this(model, power);

        if (type.matches("[A-Z]+")) {
            this.efficiently = type;
            this.displacement = "n/a";
        } else {
            this.displacement = type;
            this.efficiently = "n/a";
        }
    }

    public String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public String getDisplacement() {
        return displacement;
    }

    public String getEfficiently() {
        return efficiently;
    }

}
