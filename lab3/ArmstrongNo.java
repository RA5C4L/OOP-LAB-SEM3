import java.util.Scanner;
public class ArmstrongNo{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER NUMBER TO CHECK FOR ARMSTRONG: ");
    int n= sc.nextInt();
    int sum=0;
    int org=n;
    int dup=n;
    int l=0;;
    while(dup!=0){
        l++;
        dup=dup/10;
    }
    while(n!=0){
        int d=n%10;
        sum+=Math.pow(d,l);
        n=n/10;
    }
    if(sum==org){
        System.out.println(org+" IS AN ARMSTRONG NUMBER");
    }
    else{
        System.out.println(org+ " IS NOT AN ARMSTRONG NUMBER");
    }
}
}
