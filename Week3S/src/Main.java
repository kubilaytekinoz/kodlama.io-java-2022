import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.HibernateDao;
import dataAccess.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
       Instructor instructor1 = new Instructor(1,"Kubilay","Tekinöz","ktekinoz35@gmail.com");
        Instructor instructor2 = new Instructor(1,"Zeynep Yağmur","Tekinöz","zyt@gmail.com");

        Category category1 =  new Category(1,"Python");
        Category category2 =  new Category(1,"Java");
        Category category3 =  new Category(1,"Java");
        Course course1 = new Course(2,"Python",15000,category1,instructor1);
        Course course2 = new Course(3,"Python",17000,category2,instructor2);
        Course course3 = new Course(4,"Java",8,category2,instructor2);
        Course course4 = new Course(5,"Java",150,category2,instructor2);

        Logger logger[] = {new FileLogger() ,new DatabaseLogger() , new MailLogger()};

        CategoryManager categoryManager = new CategoryManager(new JdbcDao(),logger);
        CourseManager courseManager = new CourseManager(new HibernateDao(),logger);
        InstructorManager instructorManager = new InstructorManager(new JdbcDao(),logger);

        System.out.println("------------- Kategoriler -------------");
        categoryManager.add(category1);
        System.out.println("------------- ------- -------------");
        categoryManager.add(category2);
        System.out.println("------------- ------- -------------");
        categoryManager.add(category3);
        System.out.println("------------- Eğitmenler -------------");
        instructorManager.add(instructor1);
        System.out.println("------------- Kurslar -------------");
        courseManager.add(course1);
        System.out.println("------------- ------- -------------");
        courseManager.add(course2);
        System.out.println("------------- ------- -------------");
        courseManager.add(course3);
        System.out.println("------------- ------- -------------");
        courseManager.add(course4);

        

    }
}