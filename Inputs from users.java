import java.util.scanner;
class Input1{
  public static void main(String[]args){
    Scanner s= new scanner(System.in);
    int a=;
    System.out.println("the basic salary is "+a);
    a=s.nextInt();
    float b=0.67*a;
    float c=0.89*a;
    float d=a+b+c;
    System.out.println(" the hra is "+b);
    System.out.println("the da is "+c);
    System.out.println("the gross salary is"+d);
  }
}