//WAP read withdraw amount and print number of notes.

import java.util.Scanner;
class Atm {
  public static void main(String args[])
   {
      Scanner s=new Scanner(System.in);
     System.out.println("Enter withdraw amount");
     int amt=s.nextInt();
     int a=0,b=0,c=0;
     if(amt%100==0){        //5800
          if(amt>=500){
            a=amt/500;
            amt=amt-(a*500);
            System.out.println("500 rupees notes are : "+a);
          }
          if(amt>=200){
           b=amt/200;
            amt=amt-(b*200);
            System.out.println("200 rupees notes are: "+b);
          }
         if(amt>=100){
           c=amt/100;
           System.out.println("100 rupees notes are : "+c);
         }

       
     }
     else{
       System.out.println("Invalid amount");
     }
     
  }
}