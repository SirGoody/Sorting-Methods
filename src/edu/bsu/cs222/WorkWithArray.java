package edu.bsu.cs222;

import java.util.Scanner;

/**
 * Created by chase on 1/31/2016.
 */
public class WorkWithArray {

    //Prints the array in an organized format
    public void printArray(int[] anArray){
        for(int i = 0; i < anArray.length; i++){
            System.out.print(anArray[i] + ", ");
        }
    }

    //Method to create user input for them to create their name
    public void createUserArray(int[] anArray){
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < anArray.length; i++){
            System.out.print("What is number " + (i+1) + ": ");
            int nextNumber = input.nextInt();
            anArray[i] = nextNumber;
        }
    }

    //Makes a space to make the UI look better
    public void spacer(){
        System.out.println();
    }

}
