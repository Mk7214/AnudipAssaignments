// Strong number   "1" + "4"+ "5" = 145 =>  1! + 4! + 5! = 145
// 1! = 1
// 4! = 24
// 5! = 120  
// 1+24+120 = 145

import java.util.Scanner;

class StrongNumber {

  int factorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int number = sc.nextInt();
    int temp = number;
    int sum = 0;

    while (temp != 0) {
      int i = temp % 10;
      sum += i;
      temp = temp / 10;
    }
    if (sum == number)
      System.out.println(number + " is a strong Number");
    else
      System.out.println(number + " is a strong Number");
    sc.close();
  }

}
