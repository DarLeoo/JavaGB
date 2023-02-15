package hw_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Laptop {
    int RAM;
    int memory;
    int price;
    double weight;
    String brand;
    String OS;
    String color;

    @Override
    public String toString() {
        return "Laptop: " +
                "RAM=" + RAM +
                ", memory=" + memory +
                ", price=" + price +
                ", weight=" + weight +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'';
    }

    @Override
    public int hashCode() {
        return Objects.hash(RAM, memory);
    }

}


