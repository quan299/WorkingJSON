package WorkingwithDatabase;

import java.util.Scanner;

public class Product {
    String title;

    String thumbnail;

    String description;

    float price;

    public Product() {
    }

    public Product(String title, String thumbnail, String description, float price) {
        this.title = title;
        this.thumbnail = thumbnail;
        this.description = description;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "title=" + title + ", thumbnail=" + thumbnail + ", description=" + description + ", price=" + price + '}';
    }

    public void input() {
        System.out.println("=== Add product Info ===");
        Scanner scan = new Scanner(System.in);

        System.out.println("Add title: ");
        title = scan.nextLine();

        System.out.println("Add thumbnail: ");
        thumbnail = scan.nextLine();

        System.out.println("Add product description: ");
        description = scan.nextLine();

        System.out.println("Put a price on it : ");
        price = Float.parseFloat(scan.nextLine());
    }
}
