package hw_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class Perishable extends Product {

    protected Calendar expirationDate =
            new GregorianCalendar();

    public Perishable(String name, double cost, Calendar expirationDate) {
        super(name, cost);
        this.expirationDate = expirationDate;
    }


    @Override
    public String toString() {
        StringBuilder strOutData = new StringBuilder();
        strOutData.append(" Годен до " + " " + expirationDate.get(Calendar.YEAR)
                + "-" + expirationDate.get(Calendar.MONTH) + "-" + expirationDate.get(Calendar.DAY_OF_WEEK));
        return super.toString() + strOutData;
    }
}
