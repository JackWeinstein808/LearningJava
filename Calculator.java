class Calculator {
  
  public Calculator() {
  }
  
  //method to add
  public int add(int a, int b) {
    return a + b;
  }
  
  //method to subtract
  public int subtract(int a, int b) {
    return a - b;
  }
  
  //method to multiply
  public int multiply(int a, int b) {
    return a * b;
  }
  
  //method to divide
  public int divide(int a, int b) {
  //making sure you cannot divide by 0.
    if (b == 0) {
      System.out.println("Error: Cannot divide by 0");
      return 0;
    }
    else {
      return a / b;
    }
  }
  
  //method to divide and return a remainder
  public int modulo(int a, int b) {
    if (b == 0) {
      System.out.println("Error: Cannot divide by 0");
      return 0;
    }
    else {
      return a % b;
    }
  }

  public static void main(String[] args) {
  //calling our methods with the numbers you want to use
		Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    
  }
}
