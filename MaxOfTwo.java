import java.util.Scanner;

class MaxOfTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Finding the maximum of two numbers");
    System.out.print("Enter the First Number: ");
    int a = sc.nextInt();
    System.out.print("Enter the Second Number: ");
    int b = sc.nextInt();
    int max = a > b ? a : b;
    System.out.printf("The maximum between %d and %d is %d\n", a, b, max);
    sc.close();
  }
}
