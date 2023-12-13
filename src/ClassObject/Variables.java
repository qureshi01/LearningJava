package ClassObject;

public class Variables {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Hashim";
        s1.roll=123;
        s1.schoolName="DRS";

        Student s2 = new Student();
        s2.name="Qureshi";
        s2.roll=124;
        s2.schoolName="DRS";

        Student s3 = new Student();
        s3.name="Chennadan";
        s3.roll=125;
        s3.schoolName="DRS";

        System.out.println(s1.name);
        System.out.println(s2); //to string method is being overriden and customised in student class.
        System.out.println(s3);


    }
}
