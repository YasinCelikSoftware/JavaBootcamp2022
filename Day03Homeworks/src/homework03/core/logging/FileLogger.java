package homework03.core.logging;

public class FileLogger implements BaseLogger{

    @Override
    public void log() {
        System.out.println("Logged to : File.");
    }
}
