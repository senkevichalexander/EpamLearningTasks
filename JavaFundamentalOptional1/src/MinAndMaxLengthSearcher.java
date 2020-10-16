import java.util.Scanner;

public class MinAndMaxLengthSearcher {
    public static void searchValues() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] array = input.split(" ");

        int min = array[0].length();
        int max = 0;

        for (String value : array) {
            if (value.length() > max) max = value.length();
            else if (value.length() < min) min = value.length();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() == max)
                System.out.println("Max number is " + array[i] + " his length " + array[i].length());
            else if (array[i].length() == min)
                System.out.println("Min number is " + array[i] + " his length " + array[i].length());
        }
    }
}
