package Searching_Sorting;

public class StringBufferConcatenate {
    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "awesome!"};
        System.out.println(concatenateStrings(words));
    }

    public static String concatenateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }
}