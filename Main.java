import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);

   System.out.println("I'm here to try out for the volleyball team");

   System.out.println("Whats your name ?");
   String name = scan.next();

   System.out.println("Whats your favourite number ?");
   int favNum = scan.nextInt();
   System.out.println("Whats your age ?");
   int age = scan.nextInt(); 

   System.out.println(sportQualifications(name));


   int jersey = jerseyNumber(favNum, age);
   System.out.println("Your jersey number is " + jersey);

  }
  // create 2 methods at least one parameter and it must return a value

  static String sportQualifications(String name)
  {
    if( height < 5.7 ){
     System.out.println("Sorry, You are not tall enough");
    }else{
    System.out.println("Welcome to the team " + name + "!");
    }
  }

  static int jerseyNumber(int favNum , int age)
  {
    int jersey = favNum - age;
    return jersey; 
  }
}