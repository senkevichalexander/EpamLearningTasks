import java.util.Scanner;

public class IncreaseAndDeсreaseNumbers {
    public static void increaseValues(String[] array){


        for(int i = array.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

                if( array[j].length() > array[j+1].length() ){
                    String nmb = array[j];
                    array[j] = array[j+1];
                    array[j+1] = nmb;
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static void decreaseValues(String[] array) {

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j].length() < array[j + 1].length()) {
                    String nmb = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = nmb;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
