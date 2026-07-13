class Solution {
    public int search(int[] nums, int target) {
       if(nums.length==0){
        return -1;
       } 
       int c=0,a=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==target){
            c++;
            return i;
        }
       }
       if(c==0){
        a=-1;
       }
       return a;
    }
}