class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sr = new int[26];
        int[] tr = new int[26];
        int len = s.length() - 1;
        if(len != t.length() - 1) return false;
        while(len >= 0) {
            int si = s.charAt(len) - 'a';
            int ti = t.charAt(len) - 'a';
            sr[si]  += 1;
            tr[ti]  += 1;
            len--;
        }
        for(int i = 0; i < 26; i++) {
            if(sr[i] != tr[i]) return false;
        }
        return true;
    }
}
