//WAP to print sorting order of a given array

class Sorting{

 public static void main(String args[]){

 int temp=0;
int arr[]={22,31,25,20,19,84,33};

 for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){

 if(arr[i]<arr[j]){

 temp=arr[i]; // temp=34
arr[i]=arr[j]; // arr[i]=12
arr[j]=temp; //arr[j]=34
}
}
}
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}

}
}

