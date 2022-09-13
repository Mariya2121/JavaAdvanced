package SetsAndMapsExcercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class LogsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, TreeMap<String, Integer>> logs = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String ip = data[0];
            String name = data[1];
            int duration = Integer.parseInt(data[2]);

            if (logs.containsKey(name)) {
                if (logs.get(name).containsKey(ip)) {
                    int oldDuration = logs.get(name).get(ip);
                    logs.get(name).put(ip, oldDuration + duration);
                } else {
                    logs.get(name).put(ip, duration);
                }
            } else {
                logs.put(name, new TreeMap<>());
                logs.get(name).put(ip, duration);
            }
        }
        for (var entry : logs.entrySet()) {
            System.out.printf("%s: ", entry.getKey());
            TreeMap<String, Integer> ip = entry.getValue();
            int sum = 0;
            for (var ips : ip.entrySet()) {
                sum+= ips.getValue();
            }
            System.out.print(sum);
            System.out.print(" [");
            int count = 0;
            for (var ips : ip.entrySet()) {
                count++;
                if (count == ip.size()){
                    System.out.printf("%s", ips.getKey());break;
                }
                System.out.printf("%s, ", ips.getKey());
            }
            System.out.println("]");
        }
    }
}
