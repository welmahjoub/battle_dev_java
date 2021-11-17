import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Entrée
//        Ligne 1 : un entier N compris entre 2 et 100, représentant le nombre de boutons présents dans le cockpit.
//        Ligne 2 à N + 1 : sur chaque ligne, une chaîne de lettres minuscules indiquant le nom d'un bouton.
//        Sortie
//        Une ligne représentant la chaîne de caractères apparaissant exactement 2 fois dans la liste de boutons.
//        Il est garanti qu'il n'existe qu'une seule chaîne de caractères apparaissant 2 fois.

public class decolage {
    public static void main( String[] argv ) throws Exception {
        String  line;
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            line = sc.nextLine();
            Integer val=map.getOrDefault(line,0);
            map.put(line,val+1);
        }

        String button=map
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(2))
                .map(Map.Entry::getKey).findFirst().get();
        System.out.println(button);

    }
}
