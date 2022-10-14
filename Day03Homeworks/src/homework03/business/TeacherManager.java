package homework03.business;

import homework03.core.logging.BaseLogger;
import homework03.dataAccess.HomeworkDao;
import homework03.entities.Teacher;

import java.util.List;

public class TeacherManager {

    private HomeworkDao homeworkDao;

    private List<BaseLogger> loggers;

    public TeacherManager(HomeworkDao homeworkDao, List<BaseLogger> loggers){

        this. homeworkDao = homeworkDao;
        this.loggers = loggers;

    }

    public void save(Teacher teacher){

        System.out.print("Teacher saved : " + teacher.getFirstName() + " " +  teacher.getLastName() + " ("); homeworkDao.save();
        System.out.println(")");

        for(BaseLogger logger : loggers){

            logger.log();

        }


    }



}
