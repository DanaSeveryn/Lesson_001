package org.example;
import java.util.Arrays;

public class ArrayExercise {

  public void arrayToUpperCase(String[] input) {
    for(int i = 0; i < input.length; i++) {
      input[i] = input[i].toUpperCase();
    }
  }

  public void incrementArray(int[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] += 1;  // Increment each element by 1
    }
  }

  public int[] incrementArray1(int[] input) {
    // Add code here to increment each element in the array by 1
    return Arrays.stream(input).map(i -> i+1).toArray();
//    System.out.println(Arrays.toString(input));
  }

}
