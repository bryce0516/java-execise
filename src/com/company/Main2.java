package com.company;

import java.util.Scanner;

public class Main2 {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args){
    System.out.println("Enter Count:");
    int count = scanner.nextInt();
    scanner.nextLine();

    int[] returnedArray = readIntegers(count);
    int returnedMin = findMin(returnedArray);

    System.out.println("min = "+ returnedMin);
  }

  private static int[] readIntegers(int count){

    int[] array = new int[count];
    for( int i =0; i<array.length; i++){
      System.out.println("enter a number:");
      int number = scanner.nextInt();
      scanner.nextLine();
      array[i] = number;

    }
    return array;
  }

  private static int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    System.out.println("this is min : " + min);
    for( int i =0; i<array.length; i++){
      int value = array[i];
      if(value < min) {
        min = value;
      }
    }

    return min;
  }
}
