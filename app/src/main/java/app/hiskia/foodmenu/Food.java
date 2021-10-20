package app.hiskia.foodmenu;

import java.text.NumberFormat;

public class Food {
    private String name, desc, image;
    private Integer price;

    public Food(String name, String desc, String image, Integer price) {
        this.name = name;
        this.desc = desc;
        this.image = image;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String price = formatter.format(this.price);

        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
