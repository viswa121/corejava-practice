//WAP to read project score, external score and internal score from learner.

import java.util.Scanner;
class Grade {
  public static void main(String args[])
   {
      int total=0;
      Scanner s=new Scanner(System.in);
       int project=0,internal=0,external=0;
     System.out.println("Enter project, extenal and internal score");
     project=s.nextInt();
     external=s.nextInt();
     internal=s.nextInt();
     if(project>=50 && external>=50 && internal>=50){

       total=(project*70)/100 +(external*20)/100 +(internal*10)/100;
       System.out.println("Total score is: "+total);
       if(total>=90){
         System.out.println("A grade");
       }
       else if(total>=70){
         System.out.println("B Grade");
       }
       else{
         System.out.println("C grade");
       }
     }
     else {

       if(project<50){
         System.out.println("Failed in project and score is : "+project);
         
       }
       if(external<50){
         System.out.println("Failed in external and score is : "+external);
         
       }
       if(internal<50){
         System.out.println("Failed in internal and score is : "+internal);
         
       }
       
     }
  }
}