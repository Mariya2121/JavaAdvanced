package Еxams.EasterBasket;


import java.util.*;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (this.capacity > getCount()) {
           this.data.add(egg);
        }
    }

    public boolean removeEgg(String color) {
        return this.data.removeIf(egg -> egg.getColor().equals(color));
    }

    public Egg getStrongestEgg() {
        return this.data.stream().max(Comparator.comparing(Egg::getStrength)).orElse(null);
    }

    public Egg getEgg(String color) {
        return this.data.stream().filter(egg -> egg.getColor().equals(color)).findFirst().orElse(null);
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.material).append(" basket contains:");
        for (Egg egg : this.data) {
            sb.append(System.lineSeparator());
            sb.append(egg.toString());
        }
//        return this.material + " basket contains:" + System.lineSeparator() +
//                this.data.stream().map(Egg::toString).collect(Collectors.joining(System.lineSeparator()));
        return sb.toString();
    }
}
