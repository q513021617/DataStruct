package AlgRecursion.BackTrace;

import java.util.ArrayList;
import java.util.List;

public class CardGen {

    static int count=0;
    public static void main(String[] args) {
        int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        List<Integer> cards = new ArrayList<>();
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < 4; j++) { // 每种牌面重复4次
                cards.add(ranks[i]);
            }
        }

        List<List<Integer>> allCombinations = new ArrayList<>();
        combineCards(cards, 0, new ArrayList<>(), allCombinations);
        printCombinations(allCombinations);
    }

    public static void combineCards(List<Integer> cards, int start, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == 13) {
            result.add(new ArrayList<>(path));
            count++;
            System.out.println(count);
            return;
        }
        for (int i = start; i < cards.size(); i++) {
            path.add(cards.get(i));
            combineCards(cards, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void printCombinations(List<List<Integer>> combinations) {
        for (List<Integer> comb : combinations) {
            for (int card : comb) {
                System.out.print(card + " ");
            }
            System.out.println();
        }
    }
}