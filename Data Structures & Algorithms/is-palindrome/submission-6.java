class Solution {
    public boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < 26; i++) {
            set.add((char)('a' + i));
            if(i < 10) set.add((char)('0'+i));
        }

        char[] c = s.toCharArray();
        int i = 0, j = c.length - 1;
        while(i < j) {
            if(!set.contains(c[i])) i++;
            else if(!set.contains(c[j])) j--;
            else {
                if(c[i] != c[j]) return false;
                else {
                    i++; j--;
                }
            }
        }
        return true;
    }
}
