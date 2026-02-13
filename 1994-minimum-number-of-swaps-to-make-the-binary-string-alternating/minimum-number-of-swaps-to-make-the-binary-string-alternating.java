class Solution {
    public int minSwaps(String s) {
        int n = s.length(), z = 0, o = 0;
        for (char c : s.toCharArray()) {
            if (c == '0')
                z++;
            else
                o++;
        }
        if (n % 2 == 0 && z != o)
            return -1;
        if (n % 2 != 0 && Math.abs(z - o) != 1)
            return -1;
        if (z > o) {
            return count(s, '0');
        } else if (o > z) {
            return count(s, '1');
        } else {
            return Math.min(count(s, '0'), count(s, '1'));
        }
    }

    private int count(String s, char start) {
        int mismatch = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != start) {
                mismatch++;
            }
            start = (start == '0') ? '1' : '0';
        }

        return mismatch / 2;
    }
}