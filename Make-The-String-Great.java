class Solution {
    public String makeGood(String s) {
        int i=0;
        while (i<s.length() - 1) {
            if (Math.abs(s.charAt(i) -  s.charAt(i+1)) == 32) {
                s = s.substring(0,i) + s.substring(i+2);
                if (i>0) i--; // s: abBA --> we are at index 1 then we replace so s: aA (another possibility to replace, so we should go back one step)
            } else {
                i++;
            }
        }

        return s;
    }
}

