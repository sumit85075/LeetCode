class Solution {
    public int[] runningSum(int[] nums) {
        int res[]=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                res[j]=nums[i];
                j++;
            }
            else{
                res[j]=res[j-1]+nums[i];
                j++;
            }
        }
        return res;
    }
}