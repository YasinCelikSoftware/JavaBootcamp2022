package homework02.lesson45;

public class ProductManager {

    public void add(Product product){

        if(ProductValidator.isValid(product)){
            System.out.println("Product added.");
        }else {

            System.out.println("This product is not valid.");

        }

    }

}
