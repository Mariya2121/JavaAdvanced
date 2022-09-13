package workout;

public class Exercise {
    private String name;
    private String muscle;
    private int burnedCalories;

    public Exercise(String name, String muscle, int burnedCalorie) {
        this.name = name;
        this.muscle = muscle;
        this.burnedCalories = burnedCalorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMuscle() {
        return muscle;
    }

    public int getBurnedCalories() {
        return burnedCalories;
    }

    @Override
    public String toString() {
        return String.format("Exercise: %s, %s, %d", this.name, this.muscle, this.burnedCalories);
    }
}
