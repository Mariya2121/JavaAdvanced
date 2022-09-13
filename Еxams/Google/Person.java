package Еxams.Google;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {

    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;


    public Person() {
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }


    public List<Parent> getParents() {
        return parents;
    }

    public void setParents(List<Parent> parents) {
        this.parents = parents;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    @Override
    public String toString() {
        return "Company:" + System.lineSeparator() +
                (company == null ? "" : this.company + System.lineSeparator()) +
                "Car:" + System.lineSeparator() +
                (car == null ? "" : this.car + System.lineSeparator()) +
                "Pokemon:" + System.lineSeparator() +
                ((pokemons.isEmpty()) ? "" : this.pokemons.stream().map(Pokemon::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()) +
                "Parents:" + System.lineSeparator() +
                ((parents.isEmpty()) ? "" : this.parents.stream().map(Parent::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator()) +
                "Children:" + System.lineSeparator() +
                ((children.isEmpty()) ? "" : this.children.stream().map(Child::toString).collect(Collectors.joining(System.lineSeparator())) + System.lineSeparator());
    }
}

