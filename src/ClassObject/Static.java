package ClassObject;

public class Static {
    static int x = 20;
    int y = 30;
    final  int z=20;
    Address address;

    public static void main(String[] args) {
        Static s1 = new Static();
        System.out.println(x+s1.y); //Here value of x is not changed
        s1.x = 888;
        s1.y = 999;
        Static s2 = new Static();
        System.out.println(s2.x + "....." + s2.y);

        //System.out.println(x+y);

        //Instance variable cannot be called in static method as above example code
        //it should be called with the help of object as mentioned below
        System.out.println(x+s1.y);
        System.out.println(x+s2.y);

       // s1.z=30;
        // here the value cannot be change because the final keyword used

    }

    //Static classes can be used in nested classes
    //Top class should be always non-static
    static class Address {
        //if address have different components it can be created to a class
    }


}


//OUTPUT WILL BE : 888.....30

//Static Variable is created when class is called
//Instance variable is created when object is called

