package edu.bsu.cs222;

import java.util.Scanner;
/**
 Created by Chase Goodman 1/27/16
 */
public class Application {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SelectionSort select = new SelectionSort();
        BubbleSort bubble = new BubbleSort();
        WorkWithArray array = new WorkWithArray();

        //Getting the users size of their array
        System.out.print("How many numbers are in your array?: ");
        int howMany = input.nextInt();

        //Length of the array of numbers the user wants
        int[] anArray = new int[howMany];

        //Method to create they users array
        array.createUserArray(anArray);
        array.spacer();

        //Asks the user if they want to use Mergesort or Quicksort and does their request
        for(int i = 0; i < 10; i++){
            System.out.print("Do you want to use Selection sort or Bubble sort?: ");
            String answer = input.next();
            if(answer.contains("Selection") || answer.contains("selection")){
                select.selectionSort(anArray);
                System.out.print("---You used Selection sort---");
                array.spacer();
                break;
            }else if(answer.contains("Bubble") || answer.contains("bubble")){
                bubble.bubbleSort(anArray);
                System.out.print("---You used Selection sort---");
                array.spacer();
                break;
            }else{
                System.out.println("Please enter either Quicksort or Mergesort");
                array.spacer();
            }
        }

        //Method for printing the array
        array.printArray(anArray);

    }

}
