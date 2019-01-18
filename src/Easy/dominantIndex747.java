package Easy;

public class dominantIndex747 {
    public int dominantIndex(int[] nums) {
                int large=nums[0];
                int index=0;
                for (int a=0;a<nums.length;a++){
                    if(nums[a]>large) {
                        large = nums[a];
                        index = a;
                    }
                }
                for (int a:nums){
                    if (a<large){
                        if (a*2>large)
                            return -1;
                    }
                }
                return index;
    }
}
