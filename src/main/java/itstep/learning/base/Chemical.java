package itstep.learning.base;

import com.google.gson.JsonObject;

public class Chemical extends Product implements Compounding{
    //@Required
    private String chemicalType;
    //@Required
    private int quantity;
   // @Required
    private String compound;

    public Chemical(String title, String description, float price, String article, String chemicalType,int quantity, String compound ) {
        super.setTitle(title);
        super.setDescription(description);
        super.setPrice(price);
        super.setArticle(article);
        this.chemicalType = chemicalType;
        this.quantity = quantity;
        this.compound = compound;
    }
    public String getCompound() {
        return compound;
    }

    public void setCompound(String compound) {
        this.compound = compound;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getChemicalType() {
        return chemicalType;
    }

    public void setChemicalType(String chemicalType) {
        this.chemicalType = chemicalType;
    }

    @Override
    public String getProductCard() {
        final String ANSI_SOME = "\u001B[31m";
        final String ANSI_RESET = "\u001B[0m";
        return String.format(
                ANSI_SOME+"||Chemical:||"+ANSI_RESET+"\nTitle: %s" +
                        "\nArticle: %s" +
                        "\nPrice: %f" +
                        "\nDescription: %s" +
                        "\nChemical Type: %s" +
                        "\nQuantity: %d" +
                        "\nCompound: %s",
                super.getTitle(),
                super.getArticle(),
                super.getPrice(),
                super.getDescription(),
                this.getChemicalType(),
                this.getQuantity(),
                this.getCompound()
        );
    }

    public static Product fromJson(JsonObject jsonObject) {
        Chemical cm = new Chemical(
                jsonObject.get("title").getAsString(),
                jsonObject.get("description").getAsString(),
                jsonObject.get("price").getAsFloat(),
                jsonObject.get("article").getAsString(),
                jsonObject.get("chemicalType").getAsString(),
                jsonObject.get("quantity").getAsInt(),
                jsonObject.get("compound").getAsString()
        );
        return cm;

    }
}
