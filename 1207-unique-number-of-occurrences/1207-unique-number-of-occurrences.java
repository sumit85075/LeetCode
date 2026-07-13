class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap <Integer, Integer> hm =new HashMap <>();
        for(int val : arr){
            if(hm.containsKey(val)){
                hm.put(val,hm.get(val)+1);
            }
            else{
                hm.put(val,1);
            }
        }

        HashSet <Integer> hs= new HashSet<>();
        for(int val : hm.values()){
            if(hs.contains(val)){
                return false;
            }
            else {
                hs.add(val);
            }
        }
        return true;
    }
}