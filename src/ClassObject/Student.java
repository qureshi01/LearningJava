package ClassObject;

public class Student {
    String name;
    int roll;
    static String schoolName;

    public void play(){
        System.out.println("Student love to play");
    }
    public void study(){
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
