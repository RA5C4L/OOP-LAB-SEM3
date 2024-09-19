import java.util.Scanner;
class MatrixMultiAdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m,n,p,q,i,j,k;
        System.out.println("ENTER ROWS FOR MATRIX 1:");
        m=sc.nextInt();
        System.out.println("ENTER COLUMNS FOR MATRIX 1:");
        n=sc.nextInt();
        int m1[][]=new int[m][n];
        System.out.println("ENTER ELEMENTS FOR MATRIX 1:");
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                m1[i][j]=sc.nextInt();
            }
        }
        System.out.println("ENTER ROWS FOR MATRIX 2:");
        p=sc.nextInt();
        System.out.println("ENTER COLUMNS FOR MATRIX 2:");
        q=sc.nextInt();
        int m2[][]=new int[p][q];
        System.out.println("ENTER ELEMENTS FOR MATRIX 2:");
        for(i=0;i<p;i++){
            for(j=0;j<q;j++){
                m2[i][j]=sc.nextInt();
            }
        }
        if(m!=p||n!=q){
            System.out.println("ADDITION NOT POSSIBLE");
        }
        else{
            int add[][]=new int[m][n];
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    add[i][j]=m1[i][j]+m2[i][j];
                }
            }
            System.err.println("ADDED MATRIX:");
            for(i=0;i<m;i++){
                for(j=0;j<n;j++){
                    System.out.print(add[i][j]+"\t");
                }
                System.out.println();
            }
        }
        if(n!=p){
            System.out.println("MULTIPLICATION NOT POSSIBLE");
        }
        else{
            int mult[][]=new int[m][q];
            for (i = 0;i<m;i++) {
                for (j=0;j<q;j++) {
                    for (k=0; k<p; k++)
                        mult[i][j] += m1[i][k] * m2[k][j];
                }
            }
    
            System.out.println("MULTIPLIED MATRIX:");
            for(i=0;i<m;i++){
                for(j=0;j<q;j++){
                    System.out.print(mult[i][j]+"\t");
                }
                System.out.println();
            }
        }


    }
}