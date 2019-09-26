package edu.cnm.deepdive;

public class Square {

  /**
   * Tests {@code input} and returns {@code true} if perfect square, returns {@code false} if no
   * @param value number to test
   * @throws IllegalArgumentException if {@code value} negative
   */

  public static boolean isPerfectSquare(int value) throws IllegalArgumentException{
    if (value<0){
      //throw new IllegalArgumentException();
    }
    int roundRoot = (int) Math.sqrt(value);
    return (roundRoot * roundRoot) == value;
  }

}
