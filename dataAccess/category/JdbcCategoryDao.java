package dataAccess.category;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcCategoryDao implements BaseCategoryDao {



    @Override
    public void addCategory(Category category) {

            System.out.println("JDBC ile Kategori Eklendi : " + category.getCategoryName());


    }





    @Override
    public void deleteCategory(Category category) {

    }

}
