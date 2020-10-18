package ru.job4j.pojo;

public class Store {

    public static void main(String[] args) {
        Product milk = new Product("milk", 10);
        Product bread  = new Product("bread", 4);
        Product egg  = new Product("egg", 19);
        Product[] products = {milk, bread, egg};
        for (Product product: products) {
            System.out.println(product.getName() + ": " + product.getCount());
        }
        System.out.println("Replace milk to oil.");
        Product oil = new Product("Oil", 11);
        products[0] = oil;
        for (Product product: products) {
            System.out.println(product.getName() + ": " + product.getCount());
        }
        System.out.println("---");
        for (Product product: products) {
            if (product.getCount() > 10) {
                System.out.println(product.getName() + ": " + product.getCount());
            }
        }
    }
}
