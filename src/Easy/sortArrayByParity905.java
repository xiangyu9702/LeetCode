package Easy;

import java.util.ArrayList;

public class sortArrayByParity905 {
    public int[] sortArrayByParity(int[] A) {
        int[] count=new int[A.length];
        int e=0;
        for (int i:A
             ) {
            if (i%2==0){
                count[e]=i;
                e++;
            }
        }
        for (int i:A
                ) {
            if (i%2==1){
                count[e]=i;
                e++;
            }
        }
    return count ;
    }



}
