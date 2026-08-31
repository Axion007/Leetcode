class Solution {
    public int maxVowels(String s, int k) {
        int left=0;
        int sum=0;
        int ans=0;
        
        for(int right=0;right<s.length();right++){
            if(isVowel(s.charAt(right))){
                sum++;
            }
            if(right-left+1==k){
                ans=Math.max(ans,sum);
                if(isVowel(s.charAt(left))){
                    sum--;
                }
                left++;
            }
        }
        return ans;
    }
private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
