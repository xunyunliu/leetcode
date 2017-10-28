import java.util.*;

public class Solution17 {
    Map<Character, Set<Character>> intChar;


    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        intChar = initMap();

        if (digits.length() == 1) {
            List<String> ans = new ArrayList<>();
            //System.out.println(digits.charAt(0));
            for (Character character : intChar.get(digits.charAt(0))) {
                ans.add(String.valueOf(character));
            }
            return ans;
        } else {
            List<String> ans1 = new ArrayList<>();
            //System.out.println(digits.charAt(0));
            for (Character character : intChar.get(digits.charAt(0))) {
                update(ans1, character, letterCombinations(digits.substring(1, digits.length())));
            }
            return ans1;
        }
    }

    private void update(List<String> ans1, Character character, List<String> strings) {
        for (String s : strings) {
            ans1.add(character + s);
        }
    }


    private Map<Character, Set<Character>> initMap() {
        if (intChar == null) {
            intChar = new HashMap<>();
            intChar.put('0', new HashSet<>(' '));
            intChar.put('2', new HashSet<>(Arrays.asList('a', 'b', 'c')));
            intChar.put('3', new HashSet<>(Arrays.asList('d', 'e', 'f')));
            intChar.put('4', new HashSet<>(Arrays.asList('g', 'h', 'i')));
            intChar.put('5', new HashSet<>(Arrays.asList('j', 'k', 'l')));
            intChar.put('6', new HashSet<>(Arrays.asList('m', 'n', 'o')));
            intChar.put('7', new HashSet<>(Arrays.asList('p', 'q', 'r', 's')));
            intChar.put('8', new HashSet<>(Arrays.asList('t', 'u', 'v')));
            intChar.put('9', new HashSet<>(Arrays.asList('w', 'x', 'y', 'z')));
            return intChar;
        }
        return intChar;
    }

    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        for (String string : solution17.letterCombinations("23")) {
            System.out.println(string);
        }
    }


}
