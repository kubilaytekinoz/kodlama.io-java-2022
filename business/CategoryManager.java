package business;

import core.logging.Logger;

import dataAccess.category.BaseCategoryDao;
import entities.Category;
import validators.CategoryValidator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CategoryManager{

    private BaseCategoryDao baseCategoryDao;
    private Logger[] loggers;


    public CategoryManager(BaseCategoryDao baseCategoryDao, Logger[] loggers) {
        this.baseCategoryDao = baseCategoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) {
        baseCategoryDao.addCategory(category);
        for (Logger logger:loggers) {
            logger.log(category.getCategoryName());

        }
    }
    public void add(Category[] categories){
        for (Category category : categories){
            baseCategoryDao.addCategory(category);
            for (Logger logger:loggers) {
                logger.log(category.getCategoryName());
            }
        }

    }

    public void delete(Category category){
        baseCategoryDao.deleteCategory(category);
    }



}
