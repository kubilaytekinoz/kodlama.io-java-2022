package dataAccess.course;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateCourseDao implements BaseCourseDao {
    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName() + " Hibernate ile eklendi");
    }



    @Override
    public void deleteCourse(Course course) {

    }


}