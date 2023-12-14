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

        

    }
}
