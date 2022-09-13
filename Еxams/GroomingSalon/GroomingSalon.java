package Еxams.GroomingSalon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GroomingSalon {
    private List<Pet> data;
    private int capacity;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (this.capacity > getCount()) {
            data.add(pet);
        }
    }

    public boolean remove(String name) {
        return data.removeIf(pet -> pet.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream().filter(pet -> pet.getName().equals(name) && pet.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public String getStatistics() {
        return " The grooming salon has the following clients:" + System.lineSeparator() + data.stream()
                .map(pet -> String.format("%s %s", pet.getName(), pet.getOwner()))
                .collect(Collectors.joining(System.lineSeparator()));
    }
    public int getCount() {
        return this.data.size();
    }
}


