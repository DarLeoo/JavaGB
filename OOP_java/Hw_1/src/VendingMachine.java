package hw_7;
import Seminar_7.Product;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {


    protected List<Seminar_7.Product> localList = new ArrayList<Seminar_7.Product>();

    public List<Seminar_7.Product> getLocalList() {
        return localList;
    }

    private double cash;

    public VendingMachine addProduct(Seminar_7.Product inputProduct) {
        localList.add(inputProduct);
        inputProduct.setLoadDate(Date.valueOf(LocalDate.now()));
        return this;
    }

    @Override
    public String toString() {
        StringBuilder localString = new StringBuilder();
        for (Seminar_7.Product product : localList) {
            localString.append(product.toString());
            localString.append("\n");
        }
        localString.append(cash + "\n");
        return localString.toString();
    }

    public List<Seminar_7.Product> findProduct(String name) {
        List<Seminar_7.Product> foundProduct = new ArrayList<>();
        for (Seminar_7.Product product : localList) {
            if (product.getName().contains(name)) {
                foundProduct.add(product);
            }
        }
        return foundProduct;
    }

    public Seminar_7.Product sellProduct(Seminar_7.Product sallingProduct) {
        Seminar_7.Product sellProduct = new Product();
        if (localList.contains(sallingProduct)) {
            for (int i = 0; i < localList.size(); i++) {
                if (localList.get(i) == sallingProduct) {
                    sellProduct = localList.get(i);
                    localList.remove(i);
                    cash += sellProduct.getCost();
                    return sellProduct;
                }
            }
        }

        return sellProduct;
    }
}
