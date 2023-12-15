package ClassObject;

public class ConstructorTesting {
    public static void main(String[] args) {
        Student stu1=  new Student("Hashim",100,"DRS"); //refer student.java code for parameterized constructor
        System.out.println(stu1.name);
        System.out.println(stu1.roll);
        System.out.println(stu1.schoolName);

        System.out.println("-----------");

        Student stu2=  new Student("DRS"); //refer student.java code for parameterized constructor
        System.out.println(stu2.name);
        System.out.println(stu2.roll);
        System.out.println(stu2.schoolName);

        System.out.println("-----------");

        Student stu3= new Student(); //since we used parameterized constructor we should mention default constructor in the parent code.
    }
}
