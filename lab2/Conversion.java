import java.util.Scanner;
public class Conversion{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INTEGER: ");
        int inte=sc.nextInt();
        System.out.println("ENTER CHARACTER: ");
        char chr=sc.next().charAt(0);
        System.out.println("ENTER DOUBLE: ");
        double doub=sc.nextDouble();
        System.out.println("INT TO BYTE: "+(byte)inte);
        System.out.println("CHAR TO INT: "+(int)chr);
        System.out.println("DOUBLE TO BYTE: "+(byte)doub);
        System.out.println("DOUBLE TO BYTE: "+(byte)doub);
    }
}
