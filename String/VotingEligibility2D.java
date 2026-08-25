package String;

public class VotingEligibility2D {
    public static void main(String[] args) {
        int[] ages = generateRandomAges(10);
        String[][] eligibilityData = checkVotingEligibility(ages);
        displayTabular(eligibilityData);
    }

    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int) (Math.random() * 90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] data = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            data[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                data[i][1] = "false";
            } else if (ages[i] >= 18) {
                data[i][1] = "true";
            } else {
                data[i][1] = "false";
            }
        }
        return data;
    }

    public static void displayTabular(String[][] data) {
        System.out.println("Age\tCan Vote?");
        System.out.println("-----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }
}