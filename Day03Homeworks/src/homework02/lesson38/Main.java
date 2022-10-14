package homework02.lesson38;

public class Main {
    public static void main(String[] args) {

        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log message.");

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};

        for (BaseLogger logger:loggers){

            logger.log("Log message.");

        }*/

        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();

    }
}
