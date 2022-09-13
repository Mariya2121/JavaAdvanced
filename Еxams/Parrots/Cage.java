package Еxams.Parrots;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cage {
    private List<Parrot> data;
    private String name;
    private int capacity;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void add(Parrot parrot) {
        if (capacity > count()) {
            data.add(parrot);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(parrot -> parrot.getName().equals(name));
    }

    public Parrot sellParrot(String name) {
        Parrot parrot1 = data.stream().filter(parrot -> parrot.getName().equals(name)).findFirst().get();
        parrot1.setAvailable(false);
        return parrot1;
    }

    public List<Parrot> sellParrotBySpecies(String species) {
        List<Parrot> newParrots = new ArrayList<>();

        data.stream().filter(parrot -> parrot.getSpecies().equals(species)).forEach(parrot -> {
            parrot.setAvailable(false);
            newParrots.add(parrot);

        });

        return newParrots;

    }

    public String report() {
        return "Еxams.Parrots available at " + this.name + ":" + System.lineSeparator() +
                data.stream().filter(Parrot::isAvailable)
                        .map(Parrot::toString).collect(Collectors.joining(System.lineSeparator()));
    }

    public int count() {
        return this.data.size();
    }
}
