import java.util.*;

public class Solution17 {


    public List<String> letterCombinations(String digits) {
        Map<Character, Set<Character>> intChar = new HashMap<>();
        intChar.put('0', new HashSet<>(' '));
        intChar.put('2', new HashSet<>(Arrays.asList('a','b','c')));
        intChar.put('3', new HashSet<>(Arrays.asList('d','e','f')));
        intChar.put('4', new HashSet<>(Arrays.asList('g','h','i')));
        intChar.put('5', new HashSet<>(Arrays.asList('j','k','l')));
        intChar.put('6', new HashSet<>(Arrays.asList('m','n','o')));
        intChar.put('7', new HashSet<>(Arrays.asList('p','q','r','s')));
        intChar.put('8', new HashSet<>(Arrays.asList('t','u','v')));
        intChar.put('9', new HashSet<>(Arrays.asList('w','x','y','z')));



        for (int i =0; i< digits.length();i++){
            Character val = digits.charAt(i);


        }

    }


}
