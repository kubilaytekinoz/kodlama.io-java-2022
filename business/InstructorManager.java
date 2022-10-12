package business;

import core.logging.Logger;

import dataAccess.instructor.BaseInstructorDao;
import entities.Course;
import entities.Instructor;

public class InstructorManager {
    private BaseInstructorDao baseInstructorDao;
    private Logger[] loggers;


    public InstructorManager(BaseInstructorDao baseInstructorDao, Logger[] loggers) {
        this.baseInstructorDao = baseInstructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        baseInstructorDao.addInstructor(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getFirstName() +" "+ instructor.getLastName() +" Eklendi");

        }
    }

    public void add(Instructor[] instructors){
        for (Instructor instructor : instructors){
            baseInstructorDao.addInstructor(instructor);
            for (Logger logger:loggers) {
                logger.log(instructor.getFirstName() +" "+ instructor.getLastName() +" Eklendi");

            }
        }

    }
}
