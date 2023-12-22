package ClassObject;

public class Static {
    static int x=20;
    int y=30;

    public static void main(String[] args) {
        Static s1 = new Static();
        s1.x=888;
        s1.y=999;
        Static s2 = new Static();
        System.out.println(s2.x+"....."+s2.y);
    }
}

//OUTPUT WILL BE : 888.....30

//Static Variable is created when class is called
//Instance variable is created when object is called

