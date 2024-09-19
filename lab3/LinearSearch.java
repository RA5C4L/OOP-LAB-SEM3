import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]={2,4,1,3,5,5};
        System.out.println("ENTER NUMBER TO BE SEARCHED: ");
        int n=sc.nextInt();
        int flag=0;
        for(int i=0;i<5;i++){
            if(a[i]==n){
                flag=1;
                System.out.println("NUMBER FOUND AT POSITION "+(i+1));
            }
        }
        if(flag==0){
            System.out.println("ELEMENT NOT FOUND IN ARRAY");
        }
        
    }
}
