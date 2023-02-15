package hw_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> params = Map.of("RAM", 8, "memory", 512);


        Laptop l1 = new Laptop();
        l1.RAM = 8;
        l1.memory = 512;
        l1.price = 29999;
        l1.weight = 2.1;
        l1.OS = "Linux";
        l1.color = "Black";
        l1.brand = "Asus";

        Laptop l2 = new Laptop();
        l2.RAM = 12;
        l2.memory = 512;
        l2.price = 39999;
        l2.weight = 2.3;
        l2.OS = "Linux";
        l2.color = "Grey";
        l2.brand = "Mac";

        Laptop l3 = new Laptop();
        l3.RAM = 16;
        l3.memory = 512;
        l3.price = 29999;
        l3.weight = 2.2;
        l3.OS = "Windows";
        l3.color = "Grey";
        l2.brand = "Lenovo";

        Laptop l4 = new Laptop();
        l4.RAM = 8;
        l4.memory = 512;
        l4.price = 45000;
        l4.weight = 2.5;
        l4.OS = "Linux";
        l4.color = "Black";
        l4.brand = "Asus";

        Laptop l5 = new Laptop();
        l5.RAM = 8;
        l5.memory = 512;
        l5.price = 49999;
        l5.weight = 1.7;
        l5.OS = "Windows";
        l5.color = "Black";
        l5.brand = "Lenovo";

        List<Laptop> laptop = new ArrayList<>(Arrays.asList(l1,l2,l3,l4,l5));

        List<Laptop> filteredLaptops = laptop.stream().filter(l -> l.RAM == params.get("RAM") && l.memory == params.get("memory")).toList();
        for (Laptop item : filteredLaptops) {
            System.out.println(item.toString());
        }
        
    }

}