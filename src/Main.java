import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Main {

    int[] intArray = {5, 4, 3};
    int intArray2[]; // bad practice
    int[][] intArray3 = {{1, 2}, {3, 4}};
    boolean[] boolArray = {true, false};
    double[] doubles = {3.325, 42.425};

    public static void main(String[] args){

        int [][] table = new int [][]{{1,2,3,4,5}, {6,7,8,10,11}, {12,13,14,15,16}};

        table[1][3] = 0;

        System.out.println("table.length = " + table.length);

        for (int i = 0; i < table.length; i++){
            for (int j = 0; j <= 4; j++){
                System.out.print(table[i][j]+" ");
            }
            System.out.println();
        }

        int [] massiv = new int[10];

        Random random = new Random();

        for (int i = 0; i < massiv.length; i++){
            massiv[i] = random.nextInt(100);
        }

        Arrays.sort(massiv);

        for (int k = 0; k < massiv.length; k++){
            System.out.print(massiv[k]+" ");
        }

        System.out.println();

        Integer [] massiv2 = new Integer[10];

        Random random2 = new Random();

        for (int i = 0; i < massiv2.length; i++){
            massiv2[i] = random.nextInt(100);
        }

        Arrays.sort(massiv2, Collections.reverseOrder());

        for (int m = 0; m < massiv2.length; m++){
            System.out.print(massiv2[m]+" ");
        }
    }
}
