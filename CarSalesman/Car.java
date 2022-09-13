package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private String weight;
    private String color;

    public Car(String model, Engine engine, String weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.color = "n/a";
        this.weight = "n/a";

    }

    public Car(String model, Engine engine, String type) {
        this(model, engine);
        if (type.matches("\\d+")){
            this.weight = type;
            this.color = "n/a";
        }
        else {
            this.color = type;
            this.weight = "n/a";
        }
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }


    public String toString() {
        return String.format("%s:%n%s:%nPower: %d%nDisplacement: %s%nEfficiency: %s%nWeight: %s%nColor: %s",
                this.getModel(), this.getEngine().getModel(),
                this.getEngine().getPower(), this.getEngine().getDisplacement(),
                this.getEngine().getEfficiently(), this.getWeight(), this.getColor());
    }
}
