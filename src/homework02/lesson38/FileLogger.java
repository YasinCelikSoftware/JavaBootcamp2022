package homework02.lesson38;

public class FileLogger extends BaseLogger {

    public void log(String message){

        System.out.printf("Logged to file : %s%n",message);

    }

}
