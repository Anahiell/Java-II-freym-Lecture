package itstep.learning.base;

import com.google.gson.JsonObject;

public class Food extends Product{
    //@Required
    private String type;

    public Food(String title, String description, float price, String article, String type ) {
        super.setTitle(title);
        super.setDescription(description);
        super.setPrice(price);
        super.setArticle(article);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getProductCard() {
        final String ANSI_SOME = "\u001B[34m";
        final String ANSI_RESET = "\u001B[0m";
        return String.format(
                ANSI_SOME+"||Food:||"+ANSI_RESET+"\nTitle: %s" +
                        "\nArticle: %s" +
                        "\nPrice: %f" +
                        "\nDescription: %s" +
                        "\nType: %s",
                super.getTitle(),
                super.getArticle(),
                super.getPrice(),
                super.getDescription(),
                this.getType()
        );
    }

    public static Product fromJson(JsonObject jsonObject) {
        Food food = new Food(
                jsonObject.get("title").getAsString(),
                jsonObject.get("description").getAsString(),
                jsonObject.get("price").getAsFloat(),
                jsonObject.get("article").getAsString(),
                jsonObject.get("type").getAsString()
        );
        return food;

    }
}
