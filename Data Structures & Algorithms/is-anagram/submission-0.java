class Solution {
    public boolean countFreq(int[] freq1, int[]freq2) {

        for(int i=0; i<freq1.length; i++) {
            if(freq1[i] != freq2[i]) {
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
       if(s.length() != t.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        for(int i=0; i<s.length(); i++) {
            freq1[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++) {
            freq2[t.charAt(i) - 'a']++;
        }

        if(countFreq(freq1, freq2)) {
            return true;
        }

        return false;
    }
    }

