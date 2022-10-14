package homework02.lesson42;

public class Main {
    public static void main(String[] args) {
        ICustomerDal customerDal = new OracleCustomerDal();
        customerDal.add();
    }
}
