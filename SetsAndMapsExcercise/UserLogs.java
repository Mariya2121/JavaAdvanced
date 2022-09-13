package SetsAndMapsExcercise;

import java.util.*;

public class UserLogs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        TreeMap<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        while (!input.equals("end")) {
            String[] data = input.split("\\s+");
            String ip = data[0].substring(3);
            String username = data[2].substring(5);

            if (!map.containsKey(username)) {
                map.put(username, new LinkedHashMap<>());
            }
            if (!map.get(username).containsKey(ip)) {
                map.get(username).put(ip, 1);
            } else {
                int counter = map.get(username).get(ip);
                map.get(username).put(ip, counter + 1);
            }
            input = scanner.nextLine();
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            System.out.printf("%s: %n", entry.getKey());
            LinkedHashMap<String, Integer> attacks = entry.getValue();
            StringBuilder sb = new StringBuilder();

            for (Map.Entry<String, Integer> singleIpAttack : attacks.entrySet()) {
                String formattedAttack = String.format("%s => %d, ", singleIpAttack.getKey(), singleIpAttack.getValue());
                sb.append(formattedAttack);
            }
            String finalOutput = sb.substring(0, sb.length() - 2);
            finalOutput = finalOutput + ".";
            System.out.println(finalOutput);
        }
    }
}
