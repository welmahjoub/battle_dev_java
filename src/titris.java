import java.util.Scanner;

public class titris {

//    Ligne 1, 2 : Sur les deux premières lignes, deux entiers C1 et C2 (0 ≤ C1,C2 ≤ 255)
//    représentant les deux couleurs à mélanger.
//    Sortie
//    Afficher, sur une seule ligne, la valeur de la couleur obtenue, correspondant à la moyenne des couleurs en entrée,
//    arrondie à l'entier supérieur si nécessaire.
//
    public static void main( String[] argv ) throws Exception {
        String  line;
        Scanner sc = new Scanner(System.in);
        double n1 = Double.parseDouble(sc.nextLine());
        double n2 = Double.parseDouble(sc.nextLine());
        double n3=(n1+n2)/2;
        System.out.println(Math.ceil(n3));

    }
}

