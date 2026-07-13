class Solution {
    public boolean isMonotonic(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1])
                a++;     
        }
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1])
            b++;
        }
        if(a==nums.length-1||b==nums.length-1)
        return true;
        else
        return false;
    }
}