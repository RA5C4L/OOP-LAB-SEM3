import java.util.Scanner;
class MagicSquare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("ENTER DIMENSIONS OF SQUARE MATRIX: ");
        n=sc.nextInt();
        int M=n;
        System.out.println("ENTER ELEMENTS: ");
        int mat[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        boolean flag = false;
      int sum1 = 0,sum2=0;
      for (i = 0; i < M; i++){
         sum1 += mat[i][i];
         sum2 += mat[i][M-1-i];
      }
      if(sum1!=sum2)
      flag = true; 
      for (i = 0; i < M; i++) {
         int rowSum = 0, colSum = 0;
         for (j = 0; j < M; j++){
            rowSum += mat[i][j];
            colSum += mat[j][i];
         }
         if (rowSum != colSum || colSum != sum1)
            flag = true; 
      }
      if (!flag)
         System.out.println("MAGIC SQUARE");
      else
         System.out.println("NOT MAGIC SQUARE");
    }
}