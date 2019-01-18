package Easy;

public class hammingDistance461 {
    public int hammingDistance(int x, int y) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            res += (x & 1) ^ (y & 1);
            x = x >> 1;
            y = y >> 1;
        }
        return res;
    }
}

