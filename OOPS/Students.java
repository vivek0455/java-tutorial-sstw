package OOPS;

public class Students {
    public String name;
    private int age;
    private int rollNo;
    private String level;
    private int contact;

    //constructor
    public Students(String nam, int ages, int rollNo, String lev, int con){
        this.age =  ages;
        this.name = nam;
        this.rollNo = rollNo;
        this.level = lev;
        this.contact = con;
    }

    //default constructer
    public Students(){

    }

    //setter
    public void setLevel(String lev){
        this.level = lev;
    }

    //getter

    public String getName(){
        return this.name;
    }
    //method / function
    public void printStudentDetails(){
        System.out.println("Student details are as follow");
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Roll : " + this.rollNo);
        System.out.println("Level : " + this.level);
        System.out.println("Contact : " + this.contact);
    }
}
