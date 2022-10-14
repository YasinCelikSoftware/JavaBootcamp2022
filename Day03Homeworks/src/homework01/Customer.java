package homework01;

public class Customer {

    public int id;
    public String city;

    public Customer (){

        System.out.println("Constructor block working.");

    }

    public Customer(int id, String city){

        this.id = id;
        this.city = city;

    }


}
