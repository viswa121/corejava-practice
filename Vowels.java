import java.util.Scanner;
class Vowels{
public static void main(String args[]);
Scanner object = new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int button=sc.nextInt();
int sum,sub,mul,div;
switch(button){
  case 1:
  sum=a+b;
  System.out.println(sum);
  break;
  case 2:
    sub=a-b;
    System.out.println(sub);
    break;
    case 3:
    mul=a*b;
    System.out.println(mul);
    break;
    case 4:
    div=a/b;
    System.out.println(div);
    break;
  default:
    System.out.println("enter numbers between ");
}
}