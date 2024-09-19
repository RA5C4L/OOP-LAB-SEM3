import java.util.*;
class Factorial{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NUMBER FOR FACTORIAL: ");
    int num=sc.nextInt();
    int i;
    int fact=1;
    for(i=1;i<=num;i++){
        fact=fact*i;
    }
    System.out.println("FACTORIAL OF "+num+" IS: "+fact);
}
}
