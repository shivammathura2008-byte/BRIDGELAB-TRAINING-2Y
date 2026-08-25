package Searching_Sorting;

import java.util.HashSet;

public class StringBuilderRemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!seen.contains(c)) {
                sb.append(c);
                seen.add(c);
            }
        }
        return sb.toString();
    }
}