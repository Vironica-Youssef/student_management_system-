package product_catalog;

import java.sql.SQLOutput;

public class OnlineStore {
    public static void main(String[] arg) {

        // Create a Product object using constructor
        Product p1 = new Product("0001","program A",150.000,true );

        // Print initial product details using getters
        System.out.println("Initial Product Details:");
        System.out.println("Product ID: "+p1.getProductId());
        System.out.println("Product Name: "+p1.getProductName());
        System.out.println("Price: "+p1.getPrice());
        System.out.println("Is it stock?(true/false): "+p1.getInStock());

        System.out.println("\nCalling setPrice() with valid value:");
        p1.setPrice(500.1); // valid price update

        System.out.println("\nCalling setPrice() with invalid negative value:");
        p1.setPrice(-10.0); // invalid price update, should show error and skip


        System.out.println("\nChanging stock status:");
        System.out.println("Before changing stock status: " + p1.getInStock());
        p1.setInStock(false);
        System.out.println("After changing stock status: " + p1.getInStock());


    }}

