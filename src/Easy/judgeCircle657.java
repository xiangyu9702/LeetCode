package Easy;

public class judgeCircle657 {
    public boolean judgeCircle(String moves) {
        char[] chars=moves.toCharArray();
        int[] a={0,0};
        for (char c:chars){
            if (c=='U'){
                a[0]++;
            }
            if (c=='D'){
                a[0]--;
            }
            if (c=='L'){
                a[1]--;
            }
            if (c=='R'){
                a[1]++;
            }
        }
        return a[0]==0&&a[1]==0;
    }

    public boolean judgeCircle1(String moves) {
        int x = 0, y = 0;
        for (char move: moves.toCharArray()) {
            if (move == 'U') y--;
            else if (move == 'D') y++;
            else if (move == 'L') x--;
            else if (move == 'R') x++;
        }
        return x == 0 && y == 0;
    }
}
