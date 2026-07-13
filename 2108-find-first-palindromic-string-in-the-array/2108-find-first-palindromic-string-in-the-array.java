class Solution {
    public String firstPalindrome(String[] words) {
        String s="";
        for(int i=0;i<words.length;i++){
            String a=words[i],b="";
            for(int j=a.length()-1;j>=0;j--){
                    b+=a.charAt(j);
            }
                if(b.equals(a)){
                    s=b;
                    break;
                }
        }
             return s;
    }
}