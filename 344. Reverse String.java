class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];
        
        for (int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }
        
        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}
