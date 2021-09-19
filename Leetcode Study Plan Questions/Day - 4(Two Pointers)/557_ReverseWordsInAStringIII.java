class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int i = 0;
        for (int j=0; j<ch.length; j++){
            if (ch[j] == ' '){
                reverse(ch,i,j-1);
                i = j+1;
            } 
        }
        reverse(ch,i,ch.length-1);
        return new String(ch);
    }
    
    public void reverse(char[] ch, int start, int end) {
        while (start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;    
            start++; end--;
        }
    }
}