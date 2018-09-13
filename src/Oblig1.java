import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;

public class Oblig1 {

    ////OPPGAVE 1////
    /*

    public static int maks(int[] a){
        System.out.println("Tabell før: "+Arrays.toString(a));
        if(a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        for(int i = 0; i < a.length - 1; i++){

            if(a[i] > a[i+1]){
                int maksverdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maksverdi;
            }

        }


        System.out.println();

        return a[a.length - 1];
    }




    public static int ombyttinger(int[] a){

        if(a.length < 1){
            throw new NoSuchElementException("Tabellen er tom!");
        }

        int ombytting = 0;

        for(int i = 0; i < a.length - 1; i++){

            if(a[i] > a[i+1]){

                int maksverdi = a[i];
                a[i] = a[i+1];
                a[i+1] = maksverdi;
                ombytting++;
            }

        }

        return ombytting;
    }

*/

    //OPPGAVE 2
    /*

    public static int antallUlikeSortert(int [] a){
        if (a.length == 0){
            return 0;
        }
        for (int i = 0; i < a.length-1;i++){
            if (a[i]>a[i+1]){
                throw new IllegalStateException("tabellen er ikke sortert stigende");
            }
        }

        int antallUlikeTall= 1;

        for (int u = 0; u < a.length-1;u++) {
            if (a[u] != a[u + 1]) {
                antallUlikeTall++;
            }
        }
        return antallUlikeTall;
    }

*/
    ////// OPPGAVE 3
/*
    public static int antallUlikeUsortert(int[] a){
        if (a.length < 1){
            return  0;
        }
        int teller = a.length;

        for (int i=0;i< a.length;i++){
            int minimum = i;            // jeg bare kaller i for minimum for å ha mer oversikt her har jeg brukt selectionsort
            for (int j = i+1; j < a.length;j++){
                if (a[j] == a[minimum]){
                    teller--;
                    break;

                }
            }
        }

        return teller;
    }

*/
    //////OPPGAVE 4
/*
    public static void delsortering(int[] a) {

        int antallOddetall = finnAntallOddetall(a);


        int v = 0;
        int h = a.length - 1;

        while(v < h){

            while (v < antallOddetall && h >= antallOddetall && a[v] % 2 != 0) v++;   // h er stoppverdi for v
            while (v < antallOddetall && h >= antallOddetall && a[h] % 2 == 0) h--;


            if((a[v] % 2) == 0 && (a[h] % 2) != 0){
                bytt(a,v++,h--);

            } else if((a[v] % 2) == 0 && (a[h] % 2) == 0){
                h--;

            } else if((a[v] % 2) != 0 && (a[h] % 2) != 0){
                v++;

            }else if((a[v] % 2) != 0 && (a[h] % 2) == 0){
                v++;
                h--;

            }
        }
        Arrays.sort(a, 0, antallOddetall);
        Arrays.sort(a, antallOddetall, a.length);

    }

    public static int finnAntallOddetall(int[] a){
        int antallOddetall = 0;
        for (int i = 0; i < a.length; i++){
            if((a[i] % 2) != 0){

                antallOddetall++;
            }
        }
        return antallOddetall;
    }

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }
    */


/*
////////OPPGAVE 5
public static void rotasjon(char[] a){
    if(a.length == 0){
        return;
    }
    char temp = a[a.length-1];
    for(int i = a.length-2; i >= 0; i--){
        a[i+1] = a[i];
    }
    a[0] = temp;
}


    //OPPGAVE 6
    public static void rotasjon(char[] a, int k){
        if(k == 1){
            rotasjon(a);
            return;
        }
        int venstre = 0;
        int høyre = 0;
        int n = a.length;
        if (n == 0){
            rotasjon(a);
            return;   // tomt
        }
        if((k %= n) < 0){
            k += n;   // motsatt vei?
        }
        for (venstre = 0, høyre = n - 1; venstre < høyre;){
            rotere(a, venstre++, høyre--); // snur a[a:n>
        }
        for (venstre = 0, høyre = k - 1; venstre < høyre;){
            rotere(a, venstre++, høyre--); // snur a[0:d>
        }
        for (venstre = k, høyre = n - 1; venstre < høyre;){
            rotere(a, venstre++, høyre--);   // snur a[d:n>
        }
    }



    public static void rotere(char[] a, int i,int j){
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
*/
    //OPPGAVE 7

    public static String flett(String s,String t){
        String result = "";
        if (s.length() > t.length()){
            for (int i = 0;i < s.length();i++){
                if (i<t.length()){
                    result += s.charAt(i);
                    result += t.charAt(i);
                }else{
                    result +=s.charAt(i);
                }
            }
        }else if (t.length()>s.length()){
            for (int i = 0; i < t.length();i++){
                if (i<s.length()){
                    result += s.charAt(i);
                    result += t.charAt(i);
                }else result += t.charAt(i);

            }

            return result;
        }

        return result;

    }

    public static String flett(String... s){
        String result = "";

        int lengst = lengstString(s);
        for (int i=0; i<lengst;i++){
            for (int j=0; j <s.length;j++){
                if (i < s[j].length()){
                    result += s[j].charAt(i);
                }

            }
        }
        return result;
    }

    public static int lengstString(String... s) {
        int lengde = 0;
        for (int i=0; i <s.length;i++){
            if (lengde < s[i].length()){
                lengde = s[i].length();
            }
        }
        return lengde;
    }


}







