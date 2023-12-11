class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x != 0 && x%10 == 0)) 
            return false;
        int result=0;
        while (x>result){
            result = x%10 + result*10;
            x = x/10;
        }
        if (x==result || x==result/10)
            return true;
        else 
            return false;
    }
}