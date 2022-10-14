package homework02.lesson45;

public class ProductValidator {

    public static boolean isValid(Product product){

        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;
        }

    }

    public void bisey(){}

    public static class AnotherClass{ // Inner class.

        public static void Delete(){



        }

    }

}
