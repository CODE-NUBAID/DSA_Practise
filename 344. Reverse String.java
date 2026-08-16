class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] temp = new char[n];
        
        // Copy elements in reverse order to temp array
        for (int i = 0; i < n; i++) {
            temp[i] = s[n - 1 - i];
        }
        
        // Overwrite original array with temp array
        for (int i = 0; i < n; i++) {
            s[i] = temp[i];
        }
    }
}
