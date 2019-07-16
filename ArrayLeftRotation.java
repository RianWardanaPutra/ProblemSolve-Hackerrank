import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nd = sc.nextLine().split(" ");
        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);

        int[] arr = new int[n];

        String[] arrItems = sc.nextLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(arrItems[i]);
        }

        int[] newArr = new int[n];

        int count = 0;

        for(int i = d; i < n; i++) {
            newArr[count] = arr[i];
            count++;
        }

        for (int i = 0; i < n - (n - d); i++) {
            newArr[count] = arr[i];
            count++;
        }

        for (int a : newArr) {
            System.out.print(a + " ");
        }

        sc.close();
    }
}