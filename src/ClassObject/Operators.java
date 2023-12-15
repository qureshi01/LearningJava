package ClassObject;

public class Operators {
    public static void main(String[] args) {
        String a= "Hashim";
        int b=10 ,c=20,d=40;

        //arithmetic operator

        System.out.println(a+b+c+d);
        System.out.println(b+c+d+a);
        System.out.println(b+c+a+d);
        System.out.println(b+a+c+d);

        //relational operator

        System.out.println(d<b); //output will be always true or false
        System.out.println(b<c);
        System.out.println('a' < 97.6); //here implicit typecasting is working and compared

        //System.out.println("Hashim">"Hashim12"); relational operator cannot be applied in string or any objects

        //equality operator
        System.out.println("--------");
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = s2; // here s3 object is storing in s2 in same address

        System.out.println(s1==s2);
        System.out.println(s2==s3);

        System.out.println("--------");


        String s4 = new String("Hashim");
        String s5 = new String("Hashim");

        System.out.println(s4==s5); //refers to address
        System.out.println(s4.equals(s5)); //refers to value in object




    }
}
