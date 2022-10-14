package homework02.lesson38;

public class DatabaseLogger extends BaseLogger{

    public void log(String message){

        System.out.printf("Logged to database : %s%n",message);

    }
}
