package homework03;

import homework03.business.CategoryManager;
import homework03.business.CourseManager;
import homework03.business.TeacherManager;
import homework03.core.logging.BaseLogger;
import homework03.core.logging.DatabaseLogger;
import homework03.core.logging.EmailLogger;
import homework03.core.logging.FileLogger;
import homework03.dataAccess.HibernateHomeworkDao;
import homework03.dataAccess.JdbcHomeworkDao;
import homework03.entities.Category;
import homework03.entities.Course;
import homework03.entities.Teacher;

import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {

        List<BaseLogger> loggers = List.of(new FileLogger(), new EmailLogger(), new DatabaseLogger());

        Category category1 = new Category(1, "Programming");
        Category category2 = new Category(2, "Programming");

        CategoryManager categoryManager = new CategoryManager(new JdbcHomeworkDao(), loggers);

        categoryManager.save(category1);
        System.out.println("**************************************");
//        categoryManager.save(category2);                                // Category name is exist. This will throw exception.


        System.out.println("======================================");

        Teacher teacher1 = new Teacher(1, "Yasin", "Celik");

        TeacherManager teacherManager = new TeacherManager(new HibernateHomeworkDao(), loggers);
        teacherManager.save(teacher1);

        System.out.println("======================================");

        Course course1 = new Course(1, "Java", 15);
        Course course2 = new Course(2, "Java", 16);
        Course course3 = new Course(3, "C#", -10);

        CourseManager courseManager = new CourseManager(new JdbcHomeworkDao(), loggers);
        courseManager.save(course1);
//        System.out.println("**************************************");
//        courseManager.save(course2);                                  // Course name is exist. This will throw exception.
        System.out.println("**************************************");
        courseManager.save(course3);                                    // Course price lower than 0. This will throw exception.

    }
}
