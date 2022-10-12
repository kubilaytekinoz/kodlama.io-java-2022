package dataAccess.instructor;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class JdbcInstructorDao implements BaseInstructorDao {



    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " Jdbc ile eklendi");

    }



    @Override
    public void deleteInstructor(Instructor instructor) {

    }
}
