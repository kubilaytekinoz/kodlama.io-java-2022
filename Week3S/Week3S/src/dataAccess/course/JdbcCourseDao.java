package dataAccess.course;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcCourseDao implements BaseCourseDao {


    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName() + " Jdbc ile eklendi");
    }



    @Override
    public void deleteCourse(Course course) {

    }



}
