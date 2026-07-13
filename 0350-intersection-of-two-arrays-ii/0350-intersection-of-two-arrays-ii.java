class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    temp.add(nums1[i]);
                    nums2[j]=-1;
                    break;
                }
               }
            }
            int []nums3=new int[temp.size()];
            for(int i=0;i<nums3.length;i++){
                nums3[i]=temp.get(i);
            }
        return nums3;
         
    }
}