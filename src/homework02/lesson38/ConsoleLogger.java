package homework02.lesson38;

public class ConsoleLogger extends BaseLogger{

    public void log(String message){

        System.out.printf("Logged to console : %s%n",message);

    }

}
