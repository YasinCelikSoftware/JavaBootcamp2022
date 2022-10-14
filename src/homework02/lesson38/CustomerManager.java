package homework02.lesson38;

public class CustomerManager {

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){

        this.logger = logger;

    }

    public void add(){

        System.out.printf("Customer added.%n");
        logger.log("Log message.");

    }

}
