package homework02.lesson43;

public class MySqlCustomerDal implements ICustomerDal, IRepository {
    @Override
    public void add() {
        System.out.println("Customer saved : My Sql.");
    }
}
