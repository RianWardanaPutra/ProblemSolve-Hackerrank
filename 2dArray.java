import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Array2D {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = -9 * 9;
        int tmp;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tmp = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1]
                        + arr[i + 2][j + 2];
                /*
                 * System.out.println(); System.out.println(arr[i][j] + " " + arr[i][j+1] + " "
                 * + arr[i][j+2] + "\n  " + arr[i+1][j+1] + "\n" + arr[i+2][j] + " " +
                 * arr[i+2][j+1] + " " + arr[i+2][j+2]); System.out.println();
                 * System.out.println("i = " + i + ", j = " + j + ", temp = " + tmp + ", max = "
                 * + max);
                 */
                if (max < tmp)
                    max = tmp;
            }
        }

        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        System.out.println(result);

        scanner.close();
    }
}
