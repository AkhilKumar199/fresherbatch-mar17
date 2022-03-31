package Day4;

import java.util.Scanner;

//assert - 
public class AssertionExample {

  public static void main(String[] args) {

      // Retail
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age?");
      int age = sc.nextInt();
      assert age > 18 : "You can not vote!";
      
      System.out.println("Age entered by user is " + age);
      sc.close();
      
      //-ea for enabling the assertion
      
      int count = args.length;
      assert count == 5:"Please give me 5 args";
      
      System.out.println("You have given us 5 args!");
  }
}