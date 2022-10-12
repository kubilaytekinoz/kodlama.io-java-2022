package business;

import core.logging.Logger;
import dataAccess.course.BaseCourseDao;
import dataAccess.course.HibernateCourseDao;
import entities.Category;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager{
    private BaseCourseDao baseCourseDao;
    private Logger[] loggers;
    private List<Course> courseList = new ArrayList<>();


    public CourseManager(BaseCourseDao baseCourseDao, Logger[] loggers) {
        this.baseCourseDao = baseCourseDao;
        this.loggers = loggers;
    }

    public void add(Course course){
        baseCourseDao.addCourse(course);
        for (Logger logger : loggers
        ) {
            logger.log(course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName() + " tarafından verilen " + course.getCourseName() + " Kursu " + course.getCategory().getCategoryName() + " Kategorisine eklendi ");
        }
    }
    public void add(Course[] courses){
        for (Course course : courses){
            baseCourseDao.addCourse(course);
            for (Logger logger:loggers) {
                logger.log(course.getCourseName());

            }
        }

    }

        public void delete (Course course){
            baseCourseDao.deleteCourse(course);
        }


    }
