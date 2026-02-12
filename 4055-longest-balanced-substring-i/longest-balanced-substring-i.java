class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int[] f = new int[26];

            for (int j = i; j < n; j++) {
                f[s.charAt(j) - 'a']++;

                if (isBalanced(f)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }

    private boolean isBalanced(int[] f) {
        int freq = 0;

        for (int i = 0; i < 26; i++) {
            if (f[i] > 0) {
                if (freq == 0) {
                    freq = f[i];
                } else if (f[i] != freq) {
                    return false;
                }
            }
        }

        return true;
    }
}
