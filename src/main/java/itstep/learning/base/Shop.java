package itstep.learning.base;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
    }

    public Shop(String[] jsons) {
        if (jsons == null || jsons.length == 0) {
            System.out.println("Json is empty");
        } else {
            Gson gson = new Gson();
            products = new ArrayList<>();
            for (String json : jsons) {
                try {
                    Product product = Product.fromJson(gson.fromJson(json, JsonObject.class));
                    if (product != null) {
                        products.add(product);
                    }
                } catch (Exception e) {
                    System.out.println("Error parsing JSON: " + e.getMessage());
                }
            }
        }
    }

    public void getAllProducts() {

        for (Product p : products) {

            System.out.print(p.getProductCard() + "\n" +
                    "===========================================\n");

        }
        signature();
    }

    public void getBrandProducts() {
        for (Product p : products) {
            if (p instanceof Branding) {
                System.out.println(p.getProductCard()+ "\n" +
                        "===========================================\n");
            }
        }
        signature();
    }

    public void getCompoundingProducts() {
        for (Product p : products) {
            if (p instanceof Compounding) {
                System.out.println(p.getProductCard()+ "\n" +
                        "===========================================\n");
            }
        }
        signature();
    }
    private void signature()
    {
        System.out.println("\u001B[31m"+"⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠉⠁⠄⠄⠄⠄⠈⠉⠉⠛⠿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⠟⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠈⠻⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⠁⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⢸⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣇⠄⠄⠄⢀⣀⣀⣀⠄⠄⠄⠄⠄⢀⣀⣀⣀⡀⠄⠄⢠⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⡄⠄⣼⣿⣿⣿⣿⣷⠄⠄⠄⢀⣿⣿⣿⣿⣿⠄⠄⣼⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⠄⠹⣿⣿⣿⣿⠏⣰⣿⣷⡀⢿⣿⣿⣿⡿⠄⢸⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⠄⠄⠉⠛⠛⠁⢠⣿⣿⣿⣷⠄⠙⠛⠋⠄⠄⢸⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣄⣀⡀⠄⠄⠄⠈⠛⠋⠙⠋⠄⠄⠄⠄⣀⣀⣸⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣀⡄⠄⢀⡀⣀⠄⠄⣤⣴⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⣿⣧⣿⣿⣟⣿⢸⣧⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠸⡏⠿⢿⡿⣿⠛⠏⢿⠁⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣦⡀⠄⠈⠁⠄⠄⠄⣠⣼⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣷⣶⣤⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⡇⠄⠈⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠟⠛⢻⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⠁⠄⠄⠄⠙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠃⠄⠄⠸⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣧⣤⣶⣶⣶⣦⣄⠈⠙⠿⣿⣿⣿⡿⠟⠋⢁⣀⣀⣀⠄⢠⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⠄⠉⠁⢀⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡿⠟⢉⣠⣴⣶⣶⣤⣌⡙⠻⢿⣿⣿⣿⣿⣿⣿⣿⣿\n" +
                           "⣿⣿⣿⣿⣿⣿⡿⠟⢋⣡⣴⣾⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣈⠙⠻⢿⣿⣿⣿⣿\n" +
                           "⠟⠛⠛⠛⠋⣁⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣄⠄⠄⠄⣨\n" +
                           "⣷⡄⠄⢠⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡇⠄⣼⣿\n" +
                           "⣿⣿⣤⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
    }
}
