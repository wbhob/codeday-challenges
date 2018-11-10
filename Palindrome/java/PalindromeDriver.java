import java.io.*;
import java.util.*;

public class PalindromeDriver {

  public static void main(String[] args) {
    Scanner listOfWords;
    ArrayList<String> list = new ArrayList<String>();

    try (BufferedReader br = new BufferedReader(new FileReader("../words.txt"))) {
      String line;
      while ((line = br.readLine()) != null) {
        list.add(line);
      }
      br.close();
    } catch (Exception e) {
      System.out.println(e);
    }

    Palindrome palindrome = new Palindrome();
    String[] array = list.toArray(new String[list.size()]);
    palindrome.palindrome(array);
  }

}