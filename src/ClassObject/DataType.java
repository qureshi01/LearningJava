package ClassObject;

public class DataType {
    public static void main(String[] args) {

        //primitive datatype

        long l = 10000000000l; //by default the datatype will int and we should provide l at the end for long
        System.out.println(l);
        int x = (int) l; //explicit typecasting
        System.out.println(x);

        int y = 25;
        long m= y; //implicit typecasting
        System.out.println(m);


        float f =10.00990948489484f; //by default the datatype will double and we should provide f at the end for float
        System.out.println(f);

        boolean b=true;
        System.out.println(b);

        byte b1=127;
        byte b2=(byte) 128;
        System.out.println(b1);
        System.out.println(b2);

    }

    //string is a class -> converted to array of characters
}
