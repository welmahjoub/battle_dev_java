import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//ntrée
//        Ligne 1 et 2 : 2 chaînes de caractère de même longueur N (1 <= N <= 10). Les 2 chaînes sont composées
//        uniquement de lettres minuscules.
//        Sortie
//        Une chaîne de caractère de longueur 2N, composée alternativement des lettres des 2 chaîne
//        d'entrée : le première lettre de la chaîne de sortie est la première lettre de la première chaîne d'entrée,
//        puis la première de la seconde chaîne, puis la seconde lettre de la première chaîne...
public class combinaisonstring {

    public static void main(String[] args) throws FileNotFoundException {

        File text = new File("in.txt");
        Scanner sc = new Scanner(text);

        String c1 = sc.nextLine();
        String c2 = sc.nextLine();
        int n=c1.length();

        StringBuilder str = new StringBuilder();


        List<Character> chars = c1
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        chars.addAll(c2
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList()));

        for (int i = 0; i < n ; i++)
        {
            str.append(chars.get(i));
            str.append(chars.get(i+n));
        }

        System.out.println(str);
    }
}

// deuxiem solution

//        boolean test=true;
//        int id_c1=0;
//        int id_c2=0;
//
//        for (int i=0;i<c1.length()+c2.length();i++)
//        {
//            if(test)
//            {
//                str.append(c1.charAt(id_c1));
//                id_c1++;
//                test=!test;
//            }else {
//                str.append(c2.charAt(id_c2));
//                id_c2++;
//                test=!test;
//            }
//
//        }
