import java.util.Scanner;

class Matrimonial {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the gender female/male");
    String gender = sc.nextLine();
    System.out.println("enter the age");
    int validAge = sc.nextInt();

    if (gender.equals("female")) {
      if (validAge < 18)
        System.out.println("You are not eligible for merriage, Please wait");
      else
        System.out.println("You are eligible for merriage");
    } else {
      if (validAge < 21)
        System.out.println("You are not eligible for merriage, Please wait");
      else
        System.out.println("You are eligible for merriage");
    }

  }
}
