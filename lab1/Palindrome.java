import java.util.*;
import javax.sound.sampled.SourceDataLine;
class Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int rev=0;
        int digit;
        System.out.println("ENTER NUMBER TO CHECK: ");
        int n=sc.nextInt();
        int org=n;
        while(n!=0){
            digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        if(rev==org){
            System.out.println(org+" IS A PALINDROME");
        }
        else{
            System.out.println(org+" IS NOT A PALINDROME");
        }
    }
}