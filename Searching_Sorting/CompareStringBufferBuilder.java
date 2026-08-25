package Searching_Sorting;

public class CompareStringBufferBuilder {
    public static void main(String[] args) {
        int iterations = 1000000;
        String textToAppend = "hello";

        long startTimeBuffer = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(textToAppend);
        }
        long endTimeBuffer = System.nanoTime();

        long startTimeBuilder = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(textToAppend);
        }
        long endTimeBuilder = System.nanoTime();

        System.out.println("StringBuffer Time (ms): " + (endTimeBuffer - startTimeBuffer) / 1_000_000);
        System.out.println("StringBuilder Time (ms): " + (endTimeBuilder - startTimeBuilder) / 1_000_000);
    }
}