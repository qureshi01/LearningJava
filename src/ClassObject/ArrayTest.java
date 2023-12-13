package ClassObject;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;
        fun(arr);
        fun1(new int[]{20,40,60}); //anonymous arrays

        School[] schoolArr = new School[10];
        School school1 = new School();
        schoolArr[0] = school1;
        school1.name="SRM";
        school1.affliation="SRM University";

        System.out.println(Arrays.toString(schoolArr));

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

    public static void fun(int[] arr){
        System.out.println("Inside Fun Function");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void fun1(int[] arr){
        System.out.println("Inside Fun1 Function");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }




}




