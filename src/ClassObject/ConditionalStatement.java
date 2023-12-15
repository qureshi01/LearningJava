package ClassObject;

public class ConditionalStatement {
    public static void main(String[] args) {

        //if else statement
        int x = 0;
        int y = 10;
        if (x < y) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (x == 0) System.out.println("True Again");
        //else part is optional
        //if else part is not there brackets are too optional if the code is single line.

        //nested if

        if (x == 1) {
            System.out.println("True");
        } else if (x == 0) {
            System.out.println("True Again1");
        } else {
            System.out.println("False");
        }

        //Switch Statement

        switch(y){
            case 1:
                System.out.println("True");
            case 10:
                System.out.println("True Again3");
            default:
                System.out.println("Default Value");
        }

        System.out.println("------------");

        //usge of break is shown as break requires to stop the loop or else the next code will be executed

        switch(y){
            case 1:
                System.out.println("True");
                break;
            case 10:
                System.out.println("True Again3");
                break;
            default:
                System.out.println("Default Value");
        }

        //for loop
        System.out.println("---------");

        int[] arr= new int[]{5,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //for each loop
        //while loop
        System.out.println("--------");
        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]+" Welcome");
            i++;
        }

        //do-while

        int j =0;
        do{
            System.out.println("First step is done");
            System.out.println(arr[j]+" welcome again");
            j++;
        }while(j<arr.length);

    }

}
