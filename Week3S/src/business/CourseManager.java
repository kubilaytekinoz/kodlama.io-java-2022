package business;

import core.logging.Logger;
import dataAccess.BaseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager{
    private BaseDao baseDao;
    private Logger[] loggers;
    private List<Course> courseList = new ArrayList<>();


    public CourseManager(BaseDao baseDao,Logger[] loggers) {
        this.baseDao = baseDao;
        this.loggers = loggers;
    }



    public void add(Course course) throws Exception {
       if (course.getPrice() > 9){
           if (courseList.isEmpty()){
               courseList.add(course);
               baseDao.addCourse(course);
               for (Logger logger : loggers
               ) {
                   logger.log(course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName() + " tarafından verilen " + course.getCourseName() + " Kursu " + course.getCategory().getCategoryName() + " Kategorisine eklendi ");
               }
           }else {
               for (Course crs : courseList){
                   if (crs.getCourseName().equals(course.getCourseName())){
                       System.out.println("Bu kurs zaten kayıtlı : " + course.getCourseName());
                   }else {
                       baseDao.addCourse(course);
                       for (Logger logger : loggers
                       ) {
                           logger.log(course.getInstructor().getFirstName() + " " + course.getInstructor().getLastName() + " tarafından verilen " + course.getCourseName() + " Kursu " + course.getCategory().getCategoryName() + " Kategorisine eklendi ");
                       }
                   }}

           }




       }else {
           System.out.println("Kurs fiyatı 10 liradan düşük olamaz : " + course.getCourseName());
       }}



        public void delete (Course course){
            baseDao.deleteCourse(course);
        }


    }
