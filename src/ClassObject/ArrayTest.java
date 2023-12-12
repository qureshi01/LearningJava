package ClassObject;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        System.out.println(arr); //output starts with a class name
        System.out.println(Arrays.toString(arr)); //values
        System.out.println(arr.getClass().getName()); //to find class name


        double[] arr1 = new double['a']; //here, through implicit typecasting char is converted to integer with the help of ascii table
        arr1[0] = 5;
        arr1[10] = 10;
        arr1[2] = 15;
        System.out.println(arr1); //output starts with a class name
        System.out.println(Arrays.toString(arr1)); //values
        System.out.println(arr1.getClass().getName()); //to find class name
        System.out.println("length of arr1 : " + arr1.length);
    }


}




