package AlgRecursion.Dynamic;

import java.util.HashSet;

public class Leetcode771 {

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            char charAt = jewels.charAt(i);
            hashSet.add(charAt+"");
        }
        int count=0;
        for (int i = 0; i < stones.length(); i++) {
            char charAt = stones.charAt(i);
            if(hashSet.contains(charAt+"")){
               count++;
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        Leetcode771 leetCode70 = new Leetcode771();
        int i = leetCode70.numJewelsInStones("aA","aAagghh");
        System.out.printf(i+"");
    }
}
