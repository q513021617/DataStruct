package AlgRecursion.Dynamic;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class OD6 {
    static int ans = 0;
    static List<Integer> a = new ArrayList<>();

    static List<Integer> b = new ArrayList<>();
    static int maxBiggerCount = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            a.add(num);
        }

        for (int i = 0; i < 3; i++) {
            int num = scanner.nextInt();
            b.add(num);
        }

        a.sort(null);

        dfs(0, new boolean[a.size()], 0);
        System.out.println(ans);
        scanner.close();
    }

    public static void dfs(int level, boolean[] used, int biggerCount) {

        if (level >= a.size()) {
            if (biggerCount > maxBiggerCount) {
                maxBiggerCount = biggerCount;
                ans = 1;
            } else if (biggerCount == maxBiggerCount) {
                ans += 1;
            }
            return;
        }

        for (int i = 0; i < a.size(); i++) {
            if (used[i]) {
                continue;
            }

            if (i > 0 && a.get(i).equals(a.get(i - 1)) && !used[i - 1]) {
                continue;
            }

            used[i] = true;
            dfs(level + 1, used, biggerCount + (a.get(i) > b.get(level)? 1 : 0));
            used[i] = false;
        }
    }
}