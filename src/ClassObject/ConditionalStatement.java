package ClassObject;
import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        //if else statement
        System.out.println("IF ELSE");
        System.out.println("----------");
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
        System.out.println("NESTED IF");
        System.out.println("----------");

        if (x == 1) { //here x=0 cannot be checked because its assigning. so we should provide x==0
            System.out.println("True");
        } else if (x == 0) {
            System.out.println("True Again1");
        } else {
            System.out.println("False");
        }

        //Switch Statement
        System.out.println("SWITCH WITHOUT BREAK");
        System.out.println("----------");

        switch(y){
            case 1:
                System.out.println("True");
            case 10:
                System.out.println("True Again3");
            default:
                System.out.println("Default Value");
        }



        //usage of break is shown as break requires to stop the loop or else the next code will be executed
        System.out.println("SWITCH WITH BREAK");
        System.out.println("----------");

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

        System.out.println("FOR LOOP");
        System.out.println("----------");

        int[] arr= new int[]{5,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //for each loop
        System.out.println("FOR-EACH LOOP");
        System.out.println("----------");

        for(int i:arr){
            System.out.println("Looping "+i);
        }


        //while loop

        System.out.println("WHILE LOOP");
        System.out.println("----------");


        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]+" Welcome");
            i++;
        }

        //do-while
        System.out.println("DO-WHILE LOOP");
        System.out.println("----------");


        int j =0;
        do{
            System.out.println("First step is done");
            System.out.println(arr[j]+" welcome again");
            j++;
        }while(j<arr.length);


        //Vowel Finder
        System.out.println("VOWEL FINDER");
        System.out.println("----------");

        char z='a';
        switch(z) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("This Is A Vowel");
                break;
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("This Is A Vowel");
                break;
            default:
                System.out.println("This is a consonant");


        }

    }

}
