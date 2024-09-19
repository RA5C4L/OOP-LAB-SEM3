import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YEAR: ");
        int y=sc.nextInt();
        if(y%4!=0){
            System.out.println(y+" IS NOT A LEAP YEAR");
        }
        else if(y%100!=0){
            System.out.println(y+" IS A LEAP YEAR");
        }
        else if(y%400!=0){
            System.out.println(y+" IS NOT A LEAP YEAR");
        }
        else{
            System.out.println(y+" IS A LEAP YEAR");
        }
    }
}