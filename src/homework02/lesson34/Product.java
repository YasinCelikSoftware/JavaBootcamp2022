package homework02.lesson34;

public class Product {

    private int id;
    private String description;
    private String name;
    private double price;
    private int stockAmount;
    private String color;
    private String code;

    public Product(){

        System.out.printf("Constructor block working...%n");

    }

    public Product(int id, String name, String description, double price, int stockAmount, String color){
        System.out.printf("Constructor with parameters is working...%n");
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
        this.color = color;

    }



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0,1) + id;
    }


    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

}
