import java.util.Scanner;
class DiagonalSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("ENTER DIMENSIONS OF SQUARE MATRIX: ");
        n=sc.nextInt();
        System.out.println("ENTER ELEMENTS: ");
        int arr[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        System.out.println("PRINCIPLE DIAGONAL ELEMENTS:");
        for(i=0;i<n;i++){
            System.out.println(arr[i][i]);
            sum+=arr[i][i];
        }
        System.out.println("SUM IS: "+sum);
    }
}