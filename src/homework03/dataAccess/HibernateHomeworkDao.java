package homework03.dataAccess;

public class HibernateHomeworkDao implements HomeworkDao{
    @Override
    public void save() {
        System.out.print("Saved with hibernate.");
   }
}
