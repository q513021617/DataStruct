package AlgRecursion.PermutationAndCombination;

public class Main {

    public static int C(int m,int n){

        int n_=1;

        for (int i = 1; i <=n; i++) {
            n_=n_*i;
        }

        int n_m_=1;
        for (int i = 1; i <=(n-m); i++) {
            n_m_=n_m_*i;
        }

        int m_=1;
        for (int i = 1; i <=m; i++) {
            m_=m_*i;
        }



        return n_/(m_*n_m_);
    }

    public static void main(String[] args) {

        System.out.println(C(3,4));
        System.out.println(C(3,5));
        System.out.println(C(3,6));
    }

}
