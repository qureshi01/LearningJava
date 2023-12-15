package ClassObject;

public class Student {
    String name;
    int roll;
    static String schoolName;

    Student(){
        System.out.println("Inside The Default Constructor");
    }

    Student(String name, int roll, String schoolName){
        this.name=name;
        this.roll=roll;
        this.schoolName=schoolName;
    }

    Student(String schoolName){
        this.schoolName=schoolName;
    }


    public void play(){
        System.out.println("Student love to play");
    }
    public static void study(){
        System.out.println("Students love to study");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", schoolName="+ schoolName +
                '}';
    }
}
