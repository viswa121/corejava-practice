import java.util.Scanner;
  class Forloop{
    public static void main(String args []){
    int i,evensum;
    Scanner obj=new Scanner(System.in);
    System.out.println("enter the number");
    evensum= obj.nextInt();
      for(i=1;i<=evensum;i++){
        if(i%2==0){
          evensum=evensum+i;
          System.out.println(i+ " ");
        }
        else{
          System.out.println(i+ " ");
        }
      
      
      }
      }
  }
      
     