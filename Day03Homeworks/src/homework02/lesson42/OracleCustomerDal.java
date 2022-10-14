package homework02.lesson42;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Customer saved : Oracle.");
    }
}
