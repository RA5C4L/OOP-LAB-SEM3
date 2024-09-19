import java.util.Scanner;
class NonDiagonalSum{
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
        System.out.println("NON DIAGONAL ELEMENTS:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i!=j && j!=n-i-1){
                    System.out.println(arr[i][j]);
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("SUM IS: "+sum);
    }
}