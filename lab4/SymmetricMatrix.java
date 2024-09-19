import java.util.Scanner;
class SymmetricMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        System.out.println("ENTER ORDER OF SQUARE MATRIX:");
        n=sc.nextInt();
        int mat[][]=new int[n][n];
        System.out.println("ENTER ELEMENTS:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int trnsp[][]=new int[n][n];
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                trnsp[i][j]=mat[j][i];
            }
        }
        int flag=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(mat[i][j]==trnsp[i][j]){
                    flag=1;
                }
                else{
                    flag=0;
                    break;
                }
            }
            if(flag==0){
                break;
            }
        }
        if(flag==1){
            System.out.println("SYMMETRIC MATRIX");
        }
        else{
            System.out.println("NOT A SYMMETRIC MATRIX");
        }
    }
}