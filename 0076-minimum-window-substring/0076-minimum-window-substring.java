class Solution {
    public String minWindow(String s, String t) {
        if (s.length() == 0 || t.length() == 0) {
            return "";
        }
        int[] need = new int[128];
        for (char c : t.toCharArray()) {
            need[c]++;
        }
        int required = 0;
        for (int c : need) {
            if (c > 0) required++;
        }
        int l = 0, r = 0, formed = 0;
        int[] window = new int[128];
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            window[c]++;
            if (need[c] > 0 && window[c] == need[c]) {
                formed++;
            }
            while (l <= r && formed == required) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    start = l;
                }
                char d = s.charAt(l);
                window[d]--;
                if (need[d] > 0 && window[d] < need[d]) {
                    formed--;
                }
                l++;
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}