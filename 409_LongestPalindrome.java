class Solution {
    public int longestPalindrome(String s) {
        if (s.length()==0 || s==null) return 0;
        HashSet<Character> hashset = new HashSet<>();
        
        for (int i=0; i<s.length(); i++){
            if (hashset.contains(s.charAt(i))){
                hashset.remove(s.charAt(i));
            }
            else {
                hashset.add(s.charAt(i));
            }
        }
        
        int len = s.length()-hashset.size();
        if (hashset.size()> 0) return len+1;
        return len; 
    }
}