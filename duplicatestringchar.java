class Solution {
    public boolean areRotations(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        
        String txt = s1 + s1;
        String pat = s2;
        
        return kmpSearch(txt, pat);
    }
    private boolean kmpSearch(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int[] lps = computeLPSArray(pat, m);
        
        int i = 0; // index for txt
        int j = 0; // index for pat
        while (i < n) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == m) {
                return true; // Pattern found
            } else if (i < n && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    private int[] computeLPSArray(String pat, int m) {
        int[] lps = new int[m];
        int len = 0;
        int i = 1;
        while (i < m) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}