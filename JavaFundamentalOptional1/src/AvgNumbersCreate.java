public class AvgNumbersCreate {
    public static void comparisonNumbers(String[] array){
        double avg = 0;

        for (String x : array) {
            avg += x.length();
        }
        if (array.length > 0) avg /= array.length;
        System.out.printf("Avg: %.2f", avg);
        System.out.println("\nBiggerThanAvg");

        for (String x : array) {
            if (x.length() > avg) System.out.println(x + " Lenght" + x.length());
        }
        System.out.println("LessThanAvgLenght");

        for (String s : array) {
            if (s.length() < avg) System.out.println(s + " Lenght " + s.length());
        }
    }
}
