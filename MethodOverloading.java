class Printer {
  void printDetails(String name, int age) {
    System.out.printf("the order of parameters is name: %s, age: %d \n", name, age);
  }

  void printDetails(int age, String name) {
    System.out.printf("the order of parameters is  age: %d, name: %s \n", age, name);
  }
}

class MethodOverloading {
  public static void main(String[] args) {
    Printer p = new Printer();
    String nameFrommain = "SomeName";
    int age1 = 20;
    p.printDetails(age1, nameFrommain);
    p.printDetails(nameFrommain, age1);

  }
}
