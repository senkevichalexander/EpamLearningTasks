import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MinAndMaxLengthSearcher.searchValues();//task1

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] array = input.split(" ");
        IncreaseAndDeсreaseNumbers.increaseValues(array);
        IncreaseAndDeсreaseNumbers.decreaseValues(array);//task2

        scan = new Scanner(System.in);
        input = scan.nextLine();
        String[] array1 = input.split(" ");
        AvgNumbersCreate.comparisonNumbers(array1);



    }
}
