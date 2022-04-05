 //WAP to read n values from user and store in array then print odd values
import java.util.Scanner;
class Odd{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    System.out.println("Enter N value (Array Size) :");
    int n=s.nextInt();   // 5
    int arr[]=new int[n];
    System.out.println("Enter "+n+" values");
    for(int i=0;i<n;i++){  // i=0,1,2,3,4
             arr[i]=s.nextInt();
      
    }
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2!=0){
        System.out.print(arr[i]+" ");
      }
    }
    
  }
}  