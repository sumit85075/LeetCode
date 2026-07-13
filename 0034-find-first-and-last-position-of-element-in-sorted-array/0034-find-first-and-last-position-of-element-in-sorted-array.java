class Solution {
    public int[] searchRange(int[] nums, int target) {
        int temp[]=new int[2];
        int a=0;
        if(nums.length==0){
            temp[a]=-1;
            temp[++a]=-1;
            return temp;
        }
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                c++;
                temp[a]=i;
                a=1;
            }
        }
        if(c==0){
          temp[a]=-1;
            temp[++a]=-1;
            return temp;  
        }
        else if(c==1){
            temp[1]=temp[0];
            return temp;
        }
        return temp;
    }
}