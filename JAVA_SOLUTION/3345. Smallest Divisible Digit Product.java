class Solution {
    public int smallestNumber(int n, int t) {
        int x = n;
        
        while (true) {
            String str = String.valueOf(x);
            int product = 1;
            
            for (char ch : str.toCharArray()) {
                product *= (ch - '0');
            }
            
            if (product % t == 0) {
                return x;
            }
            
            x++;
        }
    }
}
