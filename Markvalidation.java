
// distinction, 81-90 distinction,61-80 first class, 41-60 second class, 35-40 pass, else fail
// : 1764731482:0;mkdir code/anudip/markValidation
// : 1764731495:0;mkdir code/anudip
// : 1764731524:0;write a program to check a number is negative or positive , even or odd
//
//
import java.util.Scanner;

class Markvalidation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the marks: ");
    int marks = sc.nextInt();
    if (marks >= 81) {
      System.out.println("Distinction");
    } else if (marks >= 61 && marks < 81) {
      System.out.println("First Class");

    } else if (marks >= 41 && marks < 61) {
      System.out.println("Second Class");

    } else if (marks >= 35 && marks < 41) {
      System.out.println("Pass");

    } else {
      System.out.println("Fail");
    }
    sc.close();
  }
}
