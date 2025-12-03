import java.util.Scanner;

class OddorEvenNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number: ");
    int number = sc.nextInt();
    int remainder = number % 2;
    if (remainder != 0) {
      System.out.println("Number is odd");
    } else {
      System.out.println("Number is even");
    }
    sc.close();
  }
}
