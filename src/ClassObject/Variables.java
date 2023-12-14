package ClassObject;

public class Variables {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Hashim";
        s1.roll=123;
        Student.schoolName="DRS"; //since schoolName is static it should be addressed with class name since it has only one copy for all objects

        Student s2 = new Student();
        s2.name="Qureshi";
        s2.roll=124;
        Student.schoolName="DRS";

        Student s3 = new Student();
        s3.name="Chennadan";
        s3.roll=125;
        Student.schoolName="DRS";

        System.out.println(s1.name);
        System.out.println(s1);
        System.out.println(s2); //to string method is being overriden and customised in student class.
        System.out.println(s3);

        fun(); //Calling anything static use the class reference

        Variables variables = new Variables();
        variables.fun1();  //when calling on non-static create an object and use object name as the reference


    }

    public static void fun(){
        Student.study();
        Student student1 = new Student();
        student1.play();

        System.out.println("Inside Fun");

    }

    public void fun1(){
        Student.study(); //Calling anything static use the class reference
        Student student1 = new Student();
        student1.play();  //when calling on non-static create an object and use object name as the reference

        System.out.println("Inside Fun1");

    }
}
