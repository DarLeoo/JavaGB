package hw_7;
import Seminar_7.Product;

import java.util.Date;

public class Snack extends Product{

    private int calorie;
    public Snack(String name, double cost, int calorie) {
        super(name, cost);
        this.calorie = calorie;
    }

    public Snack(int calorie){
        this.calorie = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append(String.format(" Каллорийность %d ", calorie));
             return sb.toString();
    }
}
