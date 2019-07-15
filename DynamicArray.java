import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String head = sc.nextLine();
        String[] arr = head.split(" ");
        int n = Integer.parseInt(arr[0]);
        int q = Integer.parseInt(arr[1]);
        ArrayList<Integer>[] seqList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            seqList[i] = new ArrayList<>();
        }

        String[] que = new String[q];
        int[][] que2 = new int[q][3];
        for (int i = 0; i < q; i++) {
            que[i] = sc.nextLine();
        }

        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 3; j++) {
                que2[i][j] = Integer.parseInt(que[i].split(" ")[j]);
            }
        }

        int lastAnswer = 0;

        for (int i = 0; i < q; i++) {
            if (que2[i][0] == 1) {
                try {
                    seqList[(que2[i][1] ^ lastAnswer) % n].add(que2[i][2]);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (que2[i][0] == 2) {
                int seq = (que2[i][1] ^ lastAnswer) % n;
                lastAnswer = seqList[seq].get(que2[i][2] % seqList[seq].size());
                System.out.println(lastAnswer);
            }
        }

        sc.close();
    }
}