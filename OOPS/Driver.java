package OOPS;

public class Driver {
    public static void main(String[] args) {
        Students st1 = new Students("Rohan"
        , 20, 15, "B.tech", 43984092);

        st1.printStudentDetails();
        st1.setLevel("BCA");

        st1.printStudentDetails();
        // Students st2 =  new Students();
        // st2.printStudentDetails();

        System.out.println("Student name is : "+ st1.getName());
    }
}
