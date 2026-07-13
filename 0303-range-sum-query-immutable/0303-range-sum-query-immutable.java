class NumArray {
    private int nums[];
    private int sum=0;
    public NumArray(int[] nums) {
        this.nums=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            this.nums[i+1]=sum;
        }
    }
    
    public int sumRange(int left, int right) {

        return this.nums[right+1]-this.nums[left];
    }
}

