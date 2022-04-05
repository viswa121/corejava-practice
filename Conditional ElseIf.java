//import scanner
import java.util.Scanner;
//main class
class ElseIf{
//main method
public static void main(String[]args){
  //declaring a variable
  int a;
  //creating a object using scanner
  Scanner s1=new Scanner(System.in);
  //asking the user to give his input
  System.out.println("enter a");
  //initialise a
  a=s1.nextInt();
  //if starts
  if(a%2==0){
    System.out.println("a is even");
  }
  else{
    System.out.println("a is odd");
    
  }
}
}