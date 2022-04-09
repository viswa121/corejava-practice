// importing scanner 
import java.util.Scanner;

  class Example1{
    // adding main mathod
    public static void main(String args[]){
      Scanner s = new Scanner(System.in);
      //declaring array size 
      System.out.println("Enter the array size ");
      //Initialising variables
      int n=s.nextInt();
      int max=0;
      int arr[]= new int[n];
      System.out.println("enter" + n+ "values");
        for (int i=0;i<n;i++){
          arr[i]=s.nextInt();
          if(max<arr[i]){
            max=arr[i];
          }
        }
      //Printing maximum value
      System.out.println("max value is :"+ max);
    }
  }
