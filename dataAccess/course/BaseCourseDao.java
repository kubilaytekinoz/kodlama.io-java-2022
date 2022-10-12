package dataAccess.course;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface BaseCourseDao {
    void addCourse(Course course);

    void deleteCourse(Course course);

}
