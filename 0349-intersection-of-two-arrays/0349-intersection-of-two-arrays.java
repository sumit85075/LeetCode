class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer> temp=new HashSet<Integer>();
       for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                temp.add(nums1[i]);
                nums2[j]=-1;
            }
        }
       } 
       int []nums3=new int[temp.size()];
       Iterator<Integer> itr=temp.iterator();  
       int i=0;
       while(itr.hasNext()){
        nums3[i]=itr.next();
        i++;
       }
       return nums3;
    }
}