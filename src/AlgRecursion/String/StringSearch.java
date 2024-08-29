package AlgRecursion.String;

import java.util.Arrays;

public class StringSearch {

   static int search(String pat,String txt){
        int m = pat.length();
        int n = txt.length();
        int flag=-1;
        int pos=0;
        int count=0;
        int index=-1;
        for (int i = 0; i <m ; i++) {

            if(pat.charAt(i)==txt.charAt(pos)){
                flag=i;
                count=1;
                index=i;
                while (pos<n-1){
                    if(pat.charAt(flag)==(txt.charAt(pos))){
                        count++;
                        flag++;
                    }
                    pos++;
                }
                if(count==txt.length()){

                    break;
                }
            }
        }
        return index;
    }



    static int searchHash(String pat,String txt){
        int m = pat.length();
        int n = txt.length();
        for (int i = 0; i <=m; i++) {
            String substring = pat.substring(i, i+txt.length());
            if(substring.hashCode()==txt.hashCode()){
                return i;
            }
        }
        return -1;
    }


    static void getNext(char[] pattern,int[] next){
       next[0]=-1;
       int i=0,j=-1;
       while (i<pattern.length){
           if(j==-1){
               i++;
               j++;

           }else if(pattern[i]==pattern[j]){
               i++;
               j++;
               next[i]=j;
           }else {
               j=next[j];
           }
       }
    }

    static int searchKMP(char[] str,char[] pattern ,int[] next){
       int i=0;
       int j=0;
       while (i<str.length&&j<pattern.length){
           if(j==-1||str[i]==pattern[j]){
               i++;
               j++;
           }else {
               j=next[j];
           }

       }
       if(j==pattern.length){
           return i-j;
       }else {
           return -1;
       }

    }


    public static void main(String[] args) {
//        int search = search("abcde", "bcd");
//        int search = searchHash("abcde", "bcd");
        String str1="abcfde";
        String strPattern="bbcrd";
        int[] next=new int[strPattern.length()];
        getNext(strPattern.toCharArray(),next);
        int i=searchKMP(str1.toCharArray(),strPattern.toCharArray(),next);
        System.out.println(Arrays.toString(next));
        System.out.println(i);
        System.out.println(str1.indexOf(strPattern));
//        System.out.println(search);

    }
}
