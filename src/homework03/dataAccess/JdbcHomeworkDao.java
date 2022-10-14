package homework03.dataAccess;

public class JdbcHomeworkDao implements HomeworkDao {
    @Override
    public void save() {
        System.out.print("Saved with JDBC.");
    }
}
