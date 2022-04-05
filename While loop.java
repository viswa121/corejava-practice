// import scanner class
import java.util.Scanner;
// initialise the class
  class Demo{
    // initialize the main method
    public static void main(String args[]){
      // declare and iniialize the variable
      int i = 1;
      Scanner sc =new Scanner(System.in);
      System.out.println("enter the value of n: ");
      int n=sc.nextInt();
      System.out.println("numbers arre: ");
      // starting while loop
      while(i<=n){
        System.out.println(i);
        i++;
      }
    }
  }



