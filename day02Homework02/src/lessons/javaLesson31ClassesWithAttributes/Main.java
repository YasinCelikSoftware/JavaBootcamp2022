package lessons.javaLesson31ClassesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.name="Laptop";
		product.id = 1;
		product.description = "Asus Laptop";
		product.price = 5000;
		product.unitsInStock = 3;
		System.out.println(product.name);
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
