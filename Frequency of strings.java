//WAP to print frequency of each word in a given string.
class Frequency{

 public static void main(String args[]){

 String str="welcome to bitLabs hi welcome hi";

 String words[]=str.split(" ");
int count=1;
for(int i=0;i<words.length;i++){

 for(int j=i+1;j<words.length;j++){
if(words[i].equals(words[j])){
count++;
words[j]=" ";
}
}
if(!words[i].equals(" ")){
System.out.println(words[i]+" : "+count);
}
count=1;
}
}
}



