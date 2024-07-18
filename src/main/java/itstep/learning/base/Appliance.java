package itstep.learning.base;

import com.google.gson.JsonObject;

public class Appliance extends Product implements Branding{
    //@Required
    private String brand;

    public Appliance(String title, String description, float price, String article, String brand ) {
        super.setTitle(title);
        super.setDescription(description);
        super.setPrice(price);
        super.setArticle(article);
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        brand = brand;
    }

    @Override
    public String getProductCard() {
        final String ANSI_SOME = "\u001B[37m";
        final String ANSI_RESET = "\u001B[0m";
        return String.format(
                ANSI_SOME+"||Appliance:||"+ANSI_RESET+"\nTitle: %s" +
                        "\nArticle: %s" +
                        "\nPrice: %f" +
                        "\nDescription: %s" +
                        "\nBrand: %s",
                super.getTitle(),
                super.getArticle(),
                super.getPrice(),
                super.getDescription(),
                this.getBrand()
        );
    }

    public static Product fromJson(JsonObject jsonObject) {
        Appliance apl = new Appliance(
                jsonObject.get("title").getAsString(),
                jsonObject.get("description").getAsString(),
                jsonObject.get("price").getAsFloat(),
                jsonObject.get("article").getAsString(),
                jsonObject.get("brand").getAsString()
        );
        return apl;

    }
}
