package itstep.learning.base;

import com.google.gson.JsonObject;

public class Toy extends Product implements Branding {
    //@Required
    private String color;
    //@Required
    private String brand;

    public Toy()
    {

    }
    public Toy(String title, String description, float price, String article, String color, String brand) {
        super.setTitle(title);
        super.setDescription(description);
        super.setPrice(price);
        super.setArticle(article);
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override

    public String getProductCard() {
        final String ANSI_SOME = "\u001B[33m";
        final String ANSI_RESET = "\u001B[0m";
        return String.format(
                ANSI_SOME+"||Toy:||"+ANSI_RESET+"\nTitle: %s" +
                        "\nArticle: %s" +
                        "\nPrice: %f" +
                        "\nDescription: %s" +
                        "\nBrand: %s" +
                        "\nColor: %s",
                super.getTitle(),
                super.getArticle(),
                super.getPrice(),
                super.getDescription(),
                getBrand(),
                getColor()
        );
    }

    public static Product fromJson(JsonObject jsonObject) {
        Toy toy = new Toy(
                jsonObject.get("title").getAsString(),
                jsonObject.get("description").getAsString(),
                jsonObject.get("price").getAsFloat(),
                jsonObject.get("article").getAsString(),
                jsonObject.get("color").getAsString(),
                jsonObject.get("brand").getAsString()
        );
        return toy;

    }
}
