package AlgRecursion.Simple;

public class Board {


    /**
     * 设计一个算法，判断玩家是否赢了井字游戏。输入是一个 N x N 的数组棋盘，由字符" "，"X"和"O"组成，其中字符" "代表一个空位。
     *
     * 以下是井字游戏的规则：
     *
     * 玩家轮流将字符放入空位（" "）中。
     * 第一个玩家总是放字符"O"，且第二个玩家总是放字符"X"。
     * "X"和"O"只允许放置在空位中，不允许对已放有字符的位置进行填充。
     * 当有N个相同（且非空）的字符填充任何行、列或对角线时，游戏结束，对应该字符的玩家获胜。
     * 当所有位置非空时，也算为游戏结束。
     * 如果游戏结束，玩家不允许再放置字符。
     * 如果游戏存在获胜者，就返回该游戏的获胜者使用的字符（"X"或"O"）；如果游戏以平局结束，则返回 "Draw"；如果仍会有行动（游戏未结束），则返回 "Pending"。
     *
     * @param board
     * @return
     */
    public String tictactoe(String[] board) {

        int length = board.length;
        int heng = 0; //横的和
        int zong = 0; //纵的和
        int left = 0; //左斜线
        int right = 0; //右斜线
        boolean flag = false; //记录有没有空格

        for (int i = 0; i < length; i++) {

            heng = 0; zong = 0;
            for (int j = 0; j < length; j++) {

                heng = heng +  (int) board[i].charAt(j);
                zong = zong + (int) board[j].charAt(i);

                if(board[i].charAt(j) == ' ') flag = true;
            }

            //横纵检查
            if (heng == (int)'X' * length || zong == (int)'X' * length) return "X";
            if (heng == (int)'O' * length || zong == (int)'O' * length) return "O";

            //两条斜线上的相加
            left = left + (int)board[i].charAt(i);
            right = right + (int)board[i].charAt(length - i - 1);
        }

        //两条斜线检查
        if (left == (int)'X' * length || right == (int)'X' * length) return "X";
        if (left == (int)'O' * length || right == (int)'O' * length) return "O";

        if (flag) return "Pending";
        return "Draw";

    }

    static boolean win(String[] board,String flag){
        for (int i = 0; i < 3; i++) {
//          竖向 3连
            if(flag.equals(""+board[0].charAt(i)+board[1].charAt(i)+board[2].charAt(i))){
                return true;
            }
//          横向 3连接
            if(flag.equals(board[i])){
                return true;
            }
        }
//        \向 3连
        if(flag.equals(""+board[0].charAt(0)+board[1].charAt(1)+board[2].charAt(2))){
            return true;
        }
//        /向 3连
        if(flag.equals(""+board[0].charAt(2)+board[1].charAt(1)+board[2].charAt(2))){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] temparr=new String[]{"OX ","OX ","O  "};
        String tictactoe = new Board().tictactoe(temparr);
        System.out.println(tictactoe);
    }

}
