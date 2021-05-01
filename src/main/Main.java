package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    // Question 1
    // check if a number is in an array
    public static boolean isInArray(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Question 2
    // given an integer n, print the result of 2^0 + 2^1 + 2^2 + ... + 2^n
    public static double powersOf2(int n) {
        double result = 0.0;
        for (int i = 0; i <= n; i ++) {
            result += Math.pow(2, i);
        }
        return result;
    }

    // Question 3
    // given an integer n
    // print out
    // 1
    // 12
    // 123
    // ...
    // 123...n
    public static void printNumList(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // Question 4
    // given an array of number, rearrange it in the way that all the numbers smaller than the middle number
    // come to the left, and all the numbers greater than the middle number come to the right
    public static void rearrange(int[] arr) {
        int middleIndex = arr.length/2;
        int temp = arr[arr.length - 1];
        arr[arr.length - 1] = arr[middleIndex];
        arr[middleIndex] = temp;

        int i = 0;
        int j = arr.length - 2;
        while (i < j) {
            while (arr[i] < arr[arr.length - 1] && i < j) {
                i++;
            }
            while (arr[j] > arr[arr.length - 1] && i < j) {
                j--;
            }
            if (i < j) {
                int innerTemp = arr[j];
                arr[j] = arr[i];
                arr[i] = innerTemp;
                i++;
                j--;
            }
        }
        int lastTemp = arr[arr.length - 1];
        arr[arr.length -1] = arr[i];
        arr[i] = lastTemp;
    }

    // Question 5
    // Create a Movie class that has two attributes: name (String) and list of cast (String).
    // manually create getter, setter, constructor, a method which allows you to add cast member to the list,
    // and toString method for the class.

    public static void main(String[] args) {
        Movie movie1 = new Movie("Star Wars");
        movie1.addCastMember("Actor 1");
        movie1.addCastMember("Actor 2");
        ArrayList<String> result = movie1.getCastMemebers();
        result.add("Actor 3");
        for (String s : result
             ) {
            System.out.println(s);
        }
        System.out.println(movie1.getCastMemebers().size());
    }
}
