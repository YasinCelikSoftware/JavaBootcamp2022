package homework03.business;

import homework03.core.logging.BaseLogger;
import homework03.dataAccess.HomeworkDao;
import homework03.entities.Category;
import homework03.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager {

    private HomeworkDao homeworkDao;
    private List<BaseLogger> loggers;

    public List<String> courses = new ArrayList<>();

    public CourseManager(HomeworkDao homeworkDao, List<BaseLogger> loggers) {

        this.homeworkDao = homeworkDao;
        this.loggers = loggers;

    }

    public void save(Course course) throws Exception {

        for (String courseCheck : courses) {
            if (course.getName().equals(courseCheck)) {

                throw new Exception("This course name already exists.");

            }
        }

        if (course.getPrice() < 0) {

            throw new Exception("This course's price is " + course.getPrice() + "$. Course price can not be lower than 0$.");

        }

        courses.add(course.getName());

        System.out.print("Course saved : " + course.getName() + " (");
        homeworkDao.save();
        System.out.println(")");

        for (BaseLogger logger : loggers) {

            logger.log();

        }
    }
}


