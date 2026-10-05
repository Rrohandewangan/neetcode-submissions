class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n == 0 || m == 0 || n < m) return "";

        int[] freq = new int[128];

        for(char c : t.toCharArray()) {
            freq[c]++;
        }

        int left = 0, minLen = Integer.MAX_VALUE, cnt = 0, startIdx = -1;

        for(int right=0; right < n; right++) {
            char curr = s.charAt(right);

            if(freq[curr] > 0) cnt += 1;

            freq[curr]--;
            
            while(cnt == m) {

                int currLen = right - left + 1;

                if(currLen < minLen) {
                    minLen = currLen;
                    startIdx = left;
                }

                char leftChar = s.charAt(left);

                freq[leftChar]++ ;

                if(freq[leftChar] > 0) cnt -= 1;

                left++;
            }
        }

        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}
