package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager {
    private BaseDao baseDao;
    private Logger[] loggers;


    public InstructorManager(BaseDao baseDao, Logger[] loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor){
        baseDao.addInstructor(instructor);
        for (Logger logger:loggers) {
            logger.log(instructor.getFirstName() +" "+ instructor.getLastName() +" Eklendi");

        }
    }
}
