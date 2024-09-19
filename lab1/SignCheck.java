import java.util.*;
class SignCheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int positive=0;
        int negative=0;
        int zero=0;
        int i;
        int num;
        for(i=0;i<10;i++){
            System.out.println("ENTER NUMBER:");
            num=sc.nextInt();
            if(num>0){
                positive++;
            }
            else if(num<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("POSITIVE NUMBER COUNT: "+positive);
        System.out.println("NEGATIVE NUMBER COUNT: "+negative);
        System.out.println("ZERO NUMBER COUNT: "+zero);
    }
}