import java.util.*;
public class Area{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Radius:");
        double radius=sc.nextDouble();
        double areac=3.14*radius*radius;
        double circumferencec=2*3.14*radius;
        System.out.println("AREA IS: "+areac);
        System.out.println("CIRCUMFERENCE IS: "+circumferencec);
        System.out.println("Enter Length:");
        double length=sc.nextDouble();
        System.out.println("Enter Breadth:");
        double breadth=sc.nextDouble();
        double arear=length*breadth;
        double circumferencer=2*(length+breadth);
        System.out.println("AREA IS: "+arear);
        System.out.println("CIRCUMFERENCE IS: "+circumferencer);
    }
}