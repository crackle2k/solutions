import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        int N = nums.length;
        Arrays.sort(nums);
        
        int missing = 0;
        for (int i = 0; i < N; i++) {
            if (i + 1 != nums[i]) { missing = i + 1; }
        }
        
        return missing;
    }
}
