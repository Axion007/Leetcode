class Solution {
    public boolean isAnagram(String s1, String s2) {
        if(s1.length()!=s2.length()){
            return false;
        }
       HashMap<Character,Integer> map1=new HashMap<>();
       HashMap<Character,Integer> map2=new HashMap<>();
       for(int i=0;i<s1.length();i++){
        char ch=s1.charAt(i);
        map1.put(ch,map1.getOrDefault(ch,0)+1);
        char c=s2.charAt(i);
        map2.put(c,map2.getOrDefault(c,0)+1);
       }
       return map1.equals(map2);
       
    }
}

