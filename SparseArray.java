import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws IOException{
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        scStr.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int n = scInt.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String strItem = scStr.nextLine();
            strings.add(strItem);
        }
        int q = scInt.nextInt();
        ArrayList<String> query = new ArrayList<>();
        for(int i = 0; i < q; i++) {
            String queryItem = scStr.nextLine(); 
            query.add(queryItem);
        }
        for (String que : query) {
            int count = 0;
            for (String str : strings) {
                if(que.equals(str)) count++;
            }
            System.out.println(count);
        }
        scInt.close();
        scStr.close();
    }
}