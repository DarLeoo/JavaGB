package hw_7;
import Seminar_7.Perishable;
import Seminar_7.Product;
import Seminar_7.VendingMachine;

import java.sql.Date;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Seminar_7.VendingMachine machine = new VendingMachine();
        machine.addProduct(new Seminar_7.Product("Lays", 100));
        machine.addProduct(new Seminar_7.Product("Mars", 70));
        machine.addProduct(new Seminar_7.Product("Twix", 70.99));
        machine.addProduct(new Seminar_7.Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Snack("Сникерс", 110, 3454535));

        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Молоко"));
        System.out.println(machine.findProduct("Алёнка"));
        System.out.println(machine.findProduct("Пиво"));
        System.out.println(machine.findProduct("Сникерс"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Василёк").get(0)));
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Сникерс").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);


    }
}