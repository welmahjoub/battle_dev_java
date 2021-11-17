import java.util.*;
import java.util.stream.Collectors;

//Ligne 1 : 3 entiers TF,TP et TA (avec 0 ≤ TF,TP,TA ≤ 10^6) les temps donnés en minutes pour chaque jury,
//        respectivement pour la catégorie de romans Fantastique, Policier,
//        et Autre. Ligne 2 : Un entier N (avec N ≤ 10^3) représentant le nombre de romans à lire.
//        N lignes suivantes : Séparés d'un espace, une lettre représentant le type de roman
//        (F pour fantastique, P pour policier, A pour autre) et un entier t représentant le temps en minutes nécessaire
//        pour le lire.
//        Sortie
//        Une seule ligne avec "oui" si le jury a le temps de lire tous les livres, "non" sinon.
//        Le jury a le temps de lire tous les livres si chaque membre du jury a le temps de lire tous les romans de sa spécialité.

public class bouquins {
    public static void main( String[] argv ) throws Exception {
        String  line;
        Scanner sc = new Scanner(System.in);
        line=sc.nextLine();
        List<Integer> temps = Arrays.stream(line.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(sc.nextLine());
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            line = sc.nextLine();
            String liv=line.split(" ")[0];
            int temp= Integer.parseInt(line.split(" ")[1]);
            Integer val=map.getOrDefault(liv,0);
            map.put(liv,val+temp);
        }
        int v_tf=map.getOrDefault("F",0);
        int v_tp=map.getOrDefault("P",0);
        int v_ta=map.getOrDefault("A",0);

        if(v_tf> temps.get(0) || v_tp> temps.get(1) || v_ta> temps.get(2))
        {
            System.out.println("non");

        }
        else
        {
            System.out.println("oui");

        }


    }
}
