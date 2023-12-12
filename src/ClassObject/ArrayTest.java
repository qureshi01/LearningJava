package ClassObject;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=5;
        arr[1]=10;
        arr[2]=15;
        System.out.println(arr); //output starts with a class name
        System.out.println(Arrays.toString(arr)); //values
        System.out.println(arr.getClass().getName()); //to find class name
    }


}
