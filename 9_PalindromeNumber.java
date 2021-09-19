class Solution {
    public boolean isPalindrome(int x) {
        //Two pointer approach => TC - O(n), SC - O(1)
        String s = Integer.toString(x);
        int i=0, j=s.length()-1;
        while (i<=j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            else {i++; j--;}
        }
        return true;
        
        //Reverse a number
        // int remainder = 0, revNum = 0;
        // int Original = x;
        // while (x>0){
        //     remainder = x%10;
        //     revNum = revNum*10 + remainder;
        //     x = x/10;
        // }
        // if (revNum == Original) return true;
        // else return false;
    }
}