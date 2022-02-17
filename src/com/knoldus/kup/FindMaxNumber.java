package com.knoldus.kup;

public class FindMaxNumber {
    public static void main(String[] args) {

//       writing lambda for the requirement
        MaxNumbers maxNumbers = ((m, n) ->(m>n)?m:(m<n)?n:0);

//        Calling the function
      int max = maxNumbers.findMax(3,12);
      System.out.println(max);
    }
}
