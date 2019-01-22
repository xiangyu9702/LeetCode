package Easy;

public class peakIndexInMountainArray852 {
    public int peakIndexInMountainArray(int[] A) {
        int index=0;
        for (int i=0;i<A.length-1;i++){
            if (A[i+1]<A[i]){
                index=i;
                break;
            }
        }
    return index;
    }
}
