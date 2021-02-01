class Main {
  public static void main(String[] args) 
  {

  int jersey = jerseyNumber(17, 9);
  System.out.println("Your jersey number is " + jersey);

  }
  // create 2 methods at least one parameter and it must return a value

  static int jerseyNumber(int num1 , int num2)
  {
    int jersey = num1 - num2;
  return jersey; 
  }
}