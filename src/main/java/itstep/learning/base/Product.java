package itstep.learning.base;

import com.google.gson.JsonObject;

public abstract class Product {
    private String title;
    private String description;
    private float price;
    private String article;

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract String getProductCard();

    public static Product fromJson(JsonObject jsonObject) {
//        Class<?>[] classes = {Toy.class, Chemical.class, Food.class, Appliance.class};
//
//        for (Class<?> cls : classes) {
//            try {
//                  // Создаем новый объект класса
//                    Product product = (Product) cls.getDeclaredConstructor().newInstance();
//
//                    // Заполняем поля объекта на основе данных из JsonObject
//                    Field[] fields = cls.getDeclaredFields();
//                    for (Field field : fields) {
//                        // Проверяем, есть ли у поля аннотация Required
//                        if (field.isAnnotationPresent(Required.class)) {
//                            String fieldName = field.getName();
//                            JsonElement value = jsonObject.get(fieldName);
//
//                            // Устанавливаем значение поля, если оно присутствует в JsonObject
//                            if (value != null) {
//                                field.setAccessible(true); // Разрешаем доступ к private полям
//
//                                // В зависимости от типа поля, конвертируем JsonElement в нужный тип
//                                if (field.getType() == String.class) {
//                                    field.set(product, value.getAsString());
//                                } else if (field.getType() == float.class || field.getType() == Float.class) {
//                                    field.set(product, value.getAsFloat());
//                                }
//                            }
//                        }
//                    }
//
//                    return product; // Возвращаем созданный объект
//
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return null;
//    }
        if (jsonObject.has("type")) {

            String type = jsonObject.get("type").getAsString();
            switch (type) {
                case "Toy":
                    return Toy.fromJson(jsonObject);
                case "Chemical":
                    return Chemical.fromJson(jsonObject);

                case "Food":
                    return Food.fromJson(jsonObject);

                case "Appliance":
                    return Appliance.fromJson(jsonObject);

                default:
                    throw new IllegalArgumentException("Unknown product type: " + type);

            }
        }
        return null;
    }
}
