package dataAccess.category;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateCategoryDao implements BaseCategoryDao {

    @Override
    public void addCategory(Category category) {

            System.out.println("Hibernate ile Kategori Eklendi : " + category.getCategoryName());

    }



    @Override
    public void deleteCategory(Category category) {

    }


}