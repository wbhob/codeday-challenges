import java.io.*;
import java.util.*;

public class BinarySearchDriver {

  public static void main(String[] args) {
    Scanner listOfNumbers;

    try {
      File file = new File("../random-numbers.txt");
      listOfNumbers = new Scanner(file);
      listOfNumbers = listOfNumbers.useDelimiter("\n*");
    } catch (FileNotFoundException e) {
      System.out.println("The file wasn't found. Make sure you have a file called random-numbers.txt");
      System.exit(1);
      return;
    }

    int[] integers = new int[1024];
    for (int i = 0; i < integers.length; i++) {
      integers[i] = Integer.valueOf(listOfNumbers.nextLine());
    }

    System.out.println(find(integers, 4204)); // 0
    System.out.println(find(integers, 2125353)); // 201
    System.out.println(find(integers, 7638830)); // 779
    System.out.println(find(integers, 9760609)); // 1000
    System.out.println(find(integers, 9760608)); // -1

    listOfNumbers.close();
  }

  public static int find(int[] array, int value) {
    int right = array.length - 1;
    int left = 0;
    BinarySearch binary = new BinarySearch();
    return binary.search(array, value, left, right);
  }

}