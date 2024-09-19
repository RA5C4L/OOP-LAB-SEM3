import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER FLOOR VALUE :");
        int fl=sc.nextInt();
        System.out.println("ENTER CEILING VALUE: ");
        int cl=sc.nextInt();
        int i;
        for(i=Math.max(fl,2);i<=cl;i++){
            int flag=0;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
        }
    }
}