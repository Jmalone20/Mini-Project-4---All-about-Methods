import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
   Scanner scan = new Scanner(System.in);

   System.out.println("I'm here to try out for the volleyball team");
  
   System.out.println("Whats your name ?");
   String name = scan.next();
    
   System.out.println("How tall are you ?");
   double height = scan.nextDouble();

   System.out.println("Whats your favourite number ?");
   int favNum = scan.nextInt();
   System.out.println("Whats your age ?");
   int age = scan.nextInt(); 

  // If you qualifiy it will return/give a jersey number and welcome you to the team 
  if(sportQualifications(name,height))
  {
   int jersey = jerseyNumber(favNum, age);
   System.out.println("Your jersey number is " + jersey);
   }
  }
  
  // create 2 methods at least one parameter and it must return a value
  // Will question if you qualifiy through an if/else statement 
  static boolean sportQualifications(String name, double height)
  {
    if( height <= 5.7 ){
     System.out.println("Sorry, You are not tall enough");
     return false;
    }else{
    System.out.println("Welcome to the team " + name + "!");
    return true;
    }
  }

  static int jerseyNumber(int favNum , int age)
  {
    int jersey = favNum - age;
    return jersey; 
  }
}