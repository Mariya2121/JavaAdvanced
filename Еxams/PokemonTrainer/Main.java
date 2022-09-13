package Еxams.PokemonTrainer;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] data = input.split("\\s+");
            String trainerName = data[0];
            String pokemonName = data[1];
            String pokemonElement = data[2];
            int pokemonHealth = Integer.parseInt(data[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
            Trainer trainer = (!trainers.containsKey(trainerName)) ? new Trainer(trainerName, new ArrayList<>()) : trainers.get(trainerName);

            trainer.getPokemons().add(pokemon);

            trainers.put(trainerName, trainer);

            input = scanner.nextLine();
        }
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            final String finalCommand = command;
            trainers.entrySet().forEach(entry -> {
                Trainer trainer = entry.getValue();

                List<Pokemon> filtered = trainer.getPokemons().stream().filter(pokemon -> pokemon.getElement().equals(finalCommand)).collect(Collectors.toList());

                if (filtered.size() > 0) {
                    trainer.setBadges(trainer.getBadges() + 1);
                } else {
                    List<Pokemon> newPokemons = trainer.getPokemons().stream().map(pokemon -> {
                        pokemon.setHealth(pokemon.getHealth() - 10);
                        return pokemon;
                    }).filter(pokemon -> pokemon.getHealth() > 0).collect(Collectors.toList());

                    trainer.setPokemons(newPokemons);
                }
            });
            command = scanner.nextLine();
        }

//        trainers.values().stream().sorted((a, b) -> b.getBadges() - a.getBadges()).forEach(System.out::println);
        trainers.values().stream().sorted((a, b) -> { return b.getBadges() - a.getBadges(); })
                .forEach(System.out::println);
    }
}
