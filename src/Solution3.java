

public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {

        if(s.isEmpty())
            return 0;
        int start = 0;
        int end = 0;

        int tmp_start = 0;
        int tmp_end = 0;


        while (tmp_end < s.length()) {
            if (s.substring(tmp_start, tmp_end).indexOf(s.charAt(tmp_end)) >= 0) {
                tmp_start = s.substring(tmp_start, tmp_end).indexOf(s.charAt(tmp_end)) + tmp_start + 1;
            }
            if (tmp_end - tmp_start > end - start) {
                end = tmp_end;
                start = tmp_start;
            }
            tmp_end++;
        }
        return end - start + 1;

    }


    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
