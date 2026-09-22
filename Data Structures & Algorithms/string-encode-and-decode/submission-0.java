class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs) {
            sb.append(s.length()).append('-').append(s);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int i = 0;
        while(i < str.length()) {
            int si = str.indexOf('-', i);
            try {
            int sl = Integer.parseInt(str.substring(i, si));
            strs.add(str.substring(si+1, si+1+sl));
            i = si+1+sl;
            } catch(Exception ex) {
                // handle
            }
        }
        return strs;
    }
}
