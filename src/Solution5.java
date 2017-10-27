public class Solution5 {

    public static String longestPalindrome(String s) {

        if (s == null)
            return null;
        if (s.length() <= 1)
            return s;

        String longestStr = null;
        int length = s.length();
        int[][] table = new int[length][length];

        //every single letter is palindrome
        for (int i = 0; i < length; i++) {
            table[i][i] = 1;
            longestStr = s.substring(i, i+1);
        }


        //two consecutive same letters are palindrome
        for (int i = 0; i <= length - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                table[i][i + 1] = 1;
                longestStr = s.substring(i, i + 2);
            }
        }

        for (int l = 3; l <= length; l++) {
            for (int i = 0; i <= length - l; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i + 1][j - 1];
                    if (table[i][j] == 1)
                        longestStr = s.substring(i, j + 1);
                } else {
                    table[i][j] = 0;
                }
            }
        }
        return longestStr;


    }

    public static String longestPalindrome_TLE(String s) {
        int len = s.length();
        if (len == 0)
            return null;

        int max = -1;
        int max_i = -1;
        int max_j = -1;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                int tmp_i = i;
                int tmp_j = j;
                while (tmp_i <= tmp_j) {
                    if (s.charAt(tmp_i) != s.charAt(tmp_j))
                        break;
                    else {
                        tmp_i++;
                        tmp_j--;
                    }
                }
                if (tmp_i > tmp_j && j - i + 1 > max) {
                    //System.out.println(max);
                    max = j - i + 1;
                    max_i = i;
                    max_j = j;
                }
            }
        }
        return s.substring(max_i, max_j + 1);
    }


    public static void main(String[] args) {
        System.out.println(longestPalindrome("abcda"));
    }
}
