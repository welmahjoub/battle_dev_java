import java.util.*;

public class inventaire {

//    Ligne 1 : un entier N compris entre 10 et 1000 correspondant au nombre d’articles restants dans la boutique.
//    Ligne 2 à N+1 : Une chaine comprenant entre 2 et 8 lettres minuscules et un entier compris entre 1 et 100
//    séparés par un espace correspondant respectivement au
//    nom du produit et au prix du produit. Quand un produit apparaît plusieurs fois dans l'inventaire, il a toujours le même prix.

//    Sortie
//    Une chaîne de caractères alphanumériques correspondant au produit dont la valeur du stock est la plus grande.
//    Si vous en trouvez plusieurs, affichez les tous séparés pas un espace.

    public static void main(String[] args) {

        String  line;
        Scanner sc = new Scanner(System.in);
        int i=0;
        Map<String,Double> map=new HashMap<>();
        while(sc.hasNextLine()) {
            line = sc.nextLine();
            if(i>0)
            {

                String prod=line.split(" ")[0];
                float prix= Float.parseFloat(line.split(" ")[1]);
                Double val=map.getOrDefault(prod,0.0);
                map.put(prod,val+prix);
            }
            i++;
        }

        Double maxValueInMap = (Collections.max(map.values()));
        List<String> products=new ArrayList<>();
        // Iterate through HashMap
        for (Map.Entry<String,Double> entry : map.entrySet()) {
            if (Objects.equals(entry.getValue(), maxValueInMap)) {
                products.add(entry.getKey());
            }
        }

        String res= String.join(" ", products);
        System.out.println(res);



    }




/****************************************************************
 /***/
/***/
/** SOLUTION BY David
 /***/
/***/
/********************************************************************/


    public static void main2( String[] argv ) throws Exception {
        String  line;
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> produits = new HashMap<String, Integer>();
        int max = 0;
        String resultat = "";

        while(sc.hasNextLine()) {
            line = sc.nextLine();


            int nbArt = Integer.parseInt(line);
            for (int i=0; i<nbArt; i++) {
                String prodString = sc.nextLine();
                String[] prod = prodString.split(" ");

                int prix = Integer.parseInt(prod[1]);

                if (produits.containsKey(prod[0])) {
                    Integer ancienPrix = produits.get(prod[0]);
                    produits.put(prod[0], ancienPrix + prix);
                } else {
                    produits.put(prod[0], prix);
                }

            }
        }

        for (String key : produits.keySet()) {
            if (produits.get(key) >= max) {
                max = produits.get(key);
            }
        }
        for (String key : produits.keySet()) {
            if (produits.get(key) == max) {
                resultat += key + " ";
            }
        }


        log(resultat.trim());


    }

    private static void log(String log) {
        System.out.println(log);
    }
}


