package lessons.javaLesson34Constructors;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(1,"Laptop","Asus Laptop",5000,3,"Black");
		
		/*
		 * product.setName("Laptop"); product.setId(1);
		 * product.setDescription("Asus Laptop"); product.setPrice(5000);
		 * product.setUnitsInStock(3);
		 */
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

		System.out.println(product.getCode());
	}

}
