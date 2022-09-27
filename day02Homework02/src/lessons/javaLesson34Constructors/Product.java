package lessons.javaLesson34Constructors;

public class Product {
	
	public Product(int id, String name, String description, double price, int unitsInStock, String color) {
		
		System.out.println("Constructor block working.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.unitsInStock = unitsInStock;
		this.color = color;
		
	}
	
	public Product() {
		
	}
	
	private int id; 
	private String name;
	private String description;
	private double price;
	private int unitsInStock;
	private String color;
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCode() {
		return this.name.substring(0,1) + this.id;
	}

}
