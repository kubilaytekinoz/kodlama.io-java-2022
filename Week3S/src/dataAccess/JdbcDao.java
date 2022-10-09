package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcDao implements BaseDao{


    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName() + " Jdbc ile eklendi");
    }

    @Override
    public void addCategory(Category category) {
        System.out.println(category.getCategoryName() + " Jdbc ile eklendi");
    }

    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " Jdbc ile eklendi");

    }

    @Override
    public void deleteCourse(Course course) {

    }

    @Override
    public void deleteCategory(Category category) {

    }

    @Override
    public void deleteInstructor(Instructor instructor) {

    }
}
