package homework03.business;

import homework03.core.logging.BaseLogger;
import homework03.dataAccess.HomeworkDao;
import homework03.entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager {
    private HomeworkDao homeworkDao;
    private List<BaseLogger> loggers;
    public List<String> categories = new ArrayList();

    public CategoryManager(HomeworkDao homeworkDao, List<BaseLogger> loggers) {

        this.homeworkDao = homeworkDao;
        this.loggers = loggers;

    }

    public void save(Category category) throws Exception {

        for (String categoryCheck : categories) {

            if (category.getCategoryName().equals(categoryCheck)) {
                throw new Exception("This category name already exists.");
            }

        }

        categories.add(category.getCategoryName());

        System.out.print("Category saved : " + category.getCategoryName() + " (");
        homeworkDao.save();
        System.out.println(")");

        for (BaseLogger logger : loggers) {

            logger.log();

        }
    }
}
