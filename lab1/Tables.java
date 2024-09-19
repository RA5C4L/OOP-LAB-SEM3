import java.util.*;
class Tables{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number For Tables: ");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int prod=n*i;
            System.out.println(n+" X "+i+" = "+prod);
        }
    }
}
