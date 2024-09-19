import java.util.Scanner;
public class Movie{
    String title;
    String director;
    int release_year;

    public Movie(){
        this.title="";
        this.director="";
        this.release_year=0;
    }
    public Movie(String title,String director,int release_year){
        this.title=title;
        this.director=director;
        this.release_year=release_year;
    }
    public void display(){
        System.out.println("TITLE: "+title);
        System.out.println("DIRECTOR: "+director);
        System.out.println("RELEASE YEAR: "+release_year);
    }
    public static void sortyear(Movie m[]){
        int n=2;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<2;j++){
                if(m[i].release_year>m[j].release_year){
                    Movie a=new Movie();
                    a=m[i];
                    m[i]=m[j];
                    m[j]=a;

                }
            }
        }
        for(int i=0;i<n;i++){
            m[i].display();
        }
    }
    public static void main(String[] args){
        Movie m[]=new Movie[6];
        m[0]=new Movie("Raman Story1","Rudra1",1997);
        m[1]=new Movie("Raman Story2","Rudra2",1995);
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER DIRECTOR TO SEARCH:");
        String sdir=sc.nextLine();
        //for(int i=0;i<2;i++){
            //if(m[i].director.equals(sdir)){
               // m[i].display();
           // }
       // }
        Movie.sortyear(m);


    }
}