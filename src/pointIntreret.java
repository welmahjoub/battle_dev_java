import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//# Entrée
//        # Ligne 1 : Deux entiers H et L (avec 3 ≤ H,L ≤ 100), correspondant respectivement à la hauteur et à la largeur du paysage.
//        # Lignes 2 à H+1 : Une chaîne de L caractères composée de "-" et de "X". Un "X" représente un point d'intérêt,
//        # un "-" un point sans intérêt.

//        # Sortie
//        # Deux entiers a et b correspondant aux coordonnées du coin haut gauche d'une photo de dimension 3 points par 3,
//        # contenant le plus de points d'intérêt possible.
//        # Si plusieurs photos ont le nombre maximum de points d'intérêt, vous pouvez renvoyer n'importe quelle photo maximisant le score
//        # . Remarques :
//        # 1 ≤ a ≤ H-2 et 1 ≤ b ≤ L-2
//        # Le point haut gauche du paysage est aux coordonnées (1, 1)


public class pointIntreret {
    public static void main(String[] args) throws FileNotFoundException {
        String  line;
        File text = new File("in.txt");
        Scanner sc = new Scanner(text);
        line=sc.nextLine();
        String[] dim=line.split(" ");

        int h=Integer.parseInt(dim[0]);
        int l=Integer.parseInt(dim[1]);

        int[][] mat = new int[h][l];
        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<h;i++)
        {
            line = sc.nextLine();

            for(int j=0;j<l;j++)            // parcourir line char par char
            {
                if(line.charAt(j)== 'X')
                    mat[i ][j] = 1;
                else
                    mat[i ][j] = 0;
            }

        }


        for(int i=0;i<h-2;i++)
        {
            for(int j=0;j<l-2;j++)
            {
                String cle= i +1+ " "+ (j+1);
                int sum=0;
                for(int k=i;k<i+3;k++)
                {
                    sum+= mat[k][j] + mat[k][j+1]+mat[k][j+2] + mat[k][j];
                }
                map.put(cle,sum);
            }
        }

        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();

        if(key != null)
        {
            System.out.println(key);
        }


    }
}
