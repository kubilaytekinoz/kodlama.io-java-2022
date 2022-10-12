package dataAccess.category;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface BaseCategoryDao {

    void addCategory(Category category);



    void deleteCategory(Category category);

}
