package SecaoDezMatrizes;

import java.util.Scanner;

public class Matrizes {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int [][] mat = new int[n][n];

        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal:");
        for (int i=0; i<n; i++){
            System.out.println(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i =0; i< mat.length; i++){  //ao invés de usar n posso usar o tamanho da matriz com o length (percorre as linhas)
            for(int j=0; j<mat[i].length; j++){  //percorre as colunas
                if (mat[i][j] <0) {
                    count++;
                }
            }
        }
        System.out.println("Negative numbers: " + count);






        sc.close();
    }
}
