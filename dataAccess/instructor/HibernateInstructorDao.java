package dataAccess.instructor;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateInstructorDao implements BaseInstructorDao {


    @Override
    public void addInstructor(Instructor instructor) {
        System.out.println(instructor.getFirstName() + " Hibernate ile eklendi");
    }



    @Override
    public void deleteInstructor(Instructor instructor) {

    }
}