//wap to print max and second max values
import java.util.Scanner;
class Assign{

 public static void main(String args[]){

 Scanner s=new Scanner(System.in);
System.out.println("Enter N value :");
int n=s.nextInt(); // 5
int max=0,smax=0;
int arr[]=new int[n];
System.out.println("Enter "+n+" values");
for(int i=0;i<n;i++){ // i=0,1,2,3,4
arr[i]=s.nextInt(); // 12,91,39,56,33,18
if(max<arr[i]){ // 91<39
smax=max; // smax=56
max=arr[i]; // max= 91
}
else if(smax<arr[i]){ // 39<56
smax=arr[i];
}
}
System.out.println("Max value : "+max);
System.out.println("Second Max value : "+smax);
}

}
