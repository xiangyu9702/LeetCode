package Easy;

public class diStringMatch942 {
    public int[] diStringMatch(String S) {
            int[] a=new int[S.length()+1];
            char[] b=S.toCharArray();
            int inc=0;
            int dec=S.length();
            for (int i=0;i<S.length();i++){
                if (b[i]=='I'){
                    a[i]=inc;
                    inc++;
                }
                if (b[i]=='D') {
                    a[i]=dec;
                    dec--;
                }
            }
            a[S.length()]=inc;
            return a;
    }
}
