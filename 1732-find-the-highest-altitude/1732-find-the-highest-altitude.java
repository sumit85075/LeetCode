class Solution {
    public int largestAltitude(int[] gain) {
        int al=0;
        int sum=0;
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            if(al<sum){
                al=sum;
            }
        }
        return al;
    }
}