package itstep.learning;


import itstep.learning.base.Shop;

public class App {
    public static void main(String[] args) {
        String[] jsons = {
                "{\"type\":\"Toy\",\"title\":\"Lego Set\",\"description\":\"A set of Lego blocks\",\"price\":29.99,\"article\":\"T001\",\"color\":\"Multicolor\",\"brand\":\"Lego\"}",
                "{\"type\":\"Chemical\",\"title\":\"Cleaning Agent\",\"description\":\"A powerful cleaning agent\",\"price\":15.50,\"article\":\"C001\",\"chemicalType\":\"Detergent\",\"quantity\":500,\"compound\":\"H2O\"}",
                "{\"type\":\"Appliance\",\"title\":\"Microwave Oven\",\"description\":\"A high-power microwave oven\",\"price\":99.99,\"article\":\"A001\",\"brand\":\"Panasonic\"}",
                "{\"type\":\"Food\",\"title\":\"Apple\",\"description\":\"A fresh red apple\",\"price\":0.99,\"article\":\"F001\",\"typeFood\":\"Fruit\"}",
                "{\"type\":\"Toy\",\"title\":\"Barbie Doll\",\"description\":\"A popular Barbie doll\",\"price\":19.99,\"article\":\"T002\",\"color\":\"Pink\",\"brand\":\"Mattel\"}",
                "{\"type\":\"Chemical\",\"title\":\"Window Cleaner\",\"description\":\"Effective window cleaner\",\"price\":8.75,\"article\":\"C002\",\"chemicalType\":\"Glass cleaner\",\"quantity\":750,\"compound\":\"Ethanol\"}"
        };


        Shop shop = new Shop(jsons);
        shop.getAllProducts();
        //shop.getBrandProducts();
        //shop.getCompoundingProducts();

    }
}
