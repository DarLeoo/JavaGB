package hw_1;


import java.util.Date;

public class Snack extends Product{

    private int calorie;
    public Snack(String name, double cost, int calorie) {
        super(name, cost);
        this.calorie = calorie;
    }


    @Override
    public String toString() {
        StringBuilder localCalorie = new StringBuilder(super.toString());
        localCalorie.append(String.format(" Каллорийность %d", calorie));
             return localCalorie.toString();
    }
}
