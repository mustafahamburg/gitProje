package Java.Day_61_Collections_03;

import java.util.Set;
import java.util.TreeSet;

public class _05_hashSet {
    public static void main(String[] args) {
        Set<Product>productSet=new TreeSet<>();
        productSet.add(new Product("Book",12.5)); // product objesi ekledik
        productSet.add(new Product("Magazine",23.90));
        productSet.add(new Product("Book",2.90));
        productSet.add(new Product("Bag",55.99));

        System.out.println("productSet = " + productSet);
        for (Product p : productSet) {
            System.out.println(p.getPrice());
        }

        productSet.forEach(x-> System.out.println(x.getName()));

    }
}
