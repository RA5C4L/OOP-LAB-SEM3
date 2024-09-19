import java.util.Scanner;
public class Triangle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF LEVELS: ");
        int n=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
