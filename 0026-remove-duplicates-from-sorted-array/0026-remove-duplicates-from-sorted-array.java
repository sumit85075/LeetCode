class Solution {
    public int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int a = 1;
        for (int i = 1; i < nums.length;i++) {
           if(nums[i]!=nums[i-1]){
               nums[a]=nums[i];
               a++;
           }
        }
        return a;
    }
}