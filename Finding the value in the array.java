// WAP to check the given element is present in the array or not.

class Example{

 public static void main(String args[]){

 int arr[]={23,89,34,55,90,11};
boolean b=false;
int key=134;

 for(int i=0;i<arr.length;i++){
if(key==arr[i]){
b=true;
}
}
if(b){
System.out.println("Yes, The element is present in the the array");
}
else{
System.out.println("No, The element is not present in the array");
}

}
}


