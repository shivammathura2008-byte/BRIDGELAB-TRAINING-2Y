package Searching_Sorting;

public class LinearSearchWordInSentences {
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps.",
                "Java is a popular language.",
                "I love programming."
        };
        System.out.println(findSentenceWithWord(sentences, "popular"));
    }

    public static String findSentenceWithWord(String[] sentences, String targetWord) {
        for (String sentence : sentences) {
            if (sentence.contains(targetWord)) {
                return sentence;
            }
        }
        return "Not Found";
    }
}