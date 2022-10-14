package homework02.lesson42;

public class MySqlCustomerDal implements ICustomerDal,IRepository{
    @Override
    public void add() {
        System.out.println("Customer saved : My Sql.");
    }
}
