import java.util.Scanner;


//Entrée
//        Ligne 1 : un entier D, représentant la masse d'ergol nécessaire au décollage en kg.
//        Ligne 2 : un entier L, représentant la distance totale du voyage en unités astronomiques.
//        Sortie
//        Un entier représentant la masse totale nécessaire au voyage : il faut D kg pour le décollage,
//        puis 5kg par unité astronomique pour toute la distance L du
public class astraunote {

    public static void main(String[] args) {
        String  line;
        Scanner sc = new Scanner(System.in);
        int d=Integer.parseInt(sc.nextLine());
        int l=Integer.parseInt(sc.nextLine());
        int res=d+(l*5);
        System.out.println(res);
    }
}
