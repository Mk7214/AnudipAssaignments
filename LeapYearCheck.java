class LeapYearCheck {

  static boolean checkLeapYear(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
      return true;
    return false;
  }

  public static void main(String[] args) {
    int year = 2000;
    if (checkLeapYear(year)) {
      System.out.println("It is a leap year");
      return;
    }
    System.out.println("It is not a leap year");
  }
}
