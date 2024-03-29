package hw_1;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Product("Mars", 70));
        machine.addProduct(new Product("Алёнка", 90));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new GregorianCalendar(2023,11, 2)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new GregorianCalendar(2022, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new GregorianCalendar(2022, 03, 25)));
        machine.addProduct(new Snack("Twix", 99, 33));
        machine.addProduct(new Snack("Кит-кат", 123, 44));
        System.out.println(machine);
        System.out.println("__________________________________");
        System.out.println(machine.findProduct("Бурёнка"));
        System.out.println(machine.findProduct("Кит-кат"));
        System.out.println("__________________________________");
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Twix").get(0)));
        System.out.println("продан: " + machine.sellProduct(machine.findProduct("Кит-кат").get(0)));
        System.out.println("__________________________________");
        System.out.println(machine);


    }
}