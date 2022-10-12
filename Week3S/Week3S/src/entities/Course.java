package entities;



public class Course {
    private int id;
    private String courseName;
    private double price;
    private Category category;
    private Instructor instructor;


    public Course(int id, String courseName, double price, Category category, Instructor instructor) {
        this.id = id;
        this.courseName = courseName;
        this.price = price;
        this.category = category;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
