package dataAccess;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface BaseDao {
    void addCourse(Course course);
    void addCategory(Category category);
    void addInstructor(Instructor instructor);

    void deleteCourse(Course course);
    void deleteCategory(Category category);
    void deleteInstructor(Instructor instructor);
}
