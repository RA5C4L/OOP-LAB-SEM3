import java.util.Scanner;
public class BitwiseShift{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER TO MULTIPLY OR DIVIDE BY 2: ");
        int n=sc.nextInt();
        System.out.println("ENTER 1 TO MULTIPLY BY 2 OR 2 TO DIVIDE BY 2: ");
        int c=sc.nextInt();
        if(c==1){
            int ans=(n<<1);
            System.out.println("ANSWER: "+ans);
        }
        else if(c==2){
            int ans=(n>>1);
            System.out.println("ANSWER: "+ans);
        }
        else{
            System.out.println("ENTER VALID INPUT");
        }
    }
}