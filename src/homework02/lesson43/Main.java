package homework02.lesson43;


public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager
                                            (new SqlServerCustomerDal());
        customerManager.add();
    }
}
