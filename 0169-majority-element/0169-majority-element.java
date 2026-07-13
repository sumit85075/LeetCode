class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length;) {
            int c = 1;
            int j;
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    c++;
                else {
                    break;
                }
            }
            if (b < c) {
                b = c;
                if (b > nums.length / 2)
                    a = nums[i];
            }
            i = j;
        }
        return a;

    }
}
