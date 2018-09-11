import java.util.NoSuchElementException;

public class Oblig1 {

    public static int maks(int [] a){
        if (a.length == 0){
            throw new NoSuchElementException("tabellen er tom");
        }
        int maks = a[0];
        for (int i = 1; i <a.length ; i++) {
            if(a[i]> maks){
                maks = a[i];
                System.out.println("hei ");

            }


        }
        return  maks;
    }

    public static int ombyttinger(int []a ){
        return 1;
    }
}
