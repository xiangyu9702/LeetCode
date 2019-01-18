package Easy;

import java.util.HashMap;

public class repeatedNTimes_961 {
    public int repeatedNTimes(int[] A) {
        int count=1;
        for (int i=0;i<A.length;i++){
            for (int j=i+1;i<A.length;i++){
                if (A[i]==A[j]){
                    count++;
                    System.out.println(A[j]);
                    System.out.println(A[i]+":"+count);
                }
                if (count==A.length/2-1){
                    return A[i];
                }
            }
            count=0;
        }
        return 0;
    }

}
