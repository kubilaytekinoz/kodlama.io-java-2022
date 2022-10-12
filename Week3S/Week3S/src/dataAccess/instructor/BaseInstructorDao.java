package dataAccess.instructor;

import entities.Category;
import entities.Course;
import entities.Instructor;

public interface BaseInstructorDao {

    void addInstructor(Instructor instructor);


    void deleteInstructor(Instructor instructor);
}
