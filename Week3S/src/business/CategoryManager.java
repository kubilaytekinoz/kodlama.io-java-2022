package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import dataAccess.JdbcDao;
import entities.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryManager{
    private BaseDao baseDao;
    private Logger[] loggers;
    private List<String> categoryList = new ArrayList<>();

    public CategoryManager(BaseDao baseDao, Logger[] loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        categoryList.add(category.getCategoryName());
        baseDao.addCategory(category);
        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());

        }



    }

    public void delete(Category category){
        baseDao.deleteCategory(category);
    }



}
