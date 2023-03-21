
import java.util.Arrays;
import java.util.Comparator;

public class ArrangingD {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        // sort monthly sales for Shop A in descending order
        Integer[] shopAsalesDescending = new Integer[shopAsales.length];
        for (int i = 0; i < shopAsales.length; i++) {
            shopAsalesDescending[i] = shopAsales[i];
        }
        Arrays.sort(shopAsalesDescending, Comparator.reverseOrder());

        // sort monthly sales for Shop B in descending order
        Integer[] shopBsalesDescending = new Integer[shopBsales.length];
        for (int i = 0; i < shopBsales.length; i++) {
            shopBsalesDescending[i] = shopBsales[i];
        }
        Arrays.sort(shopBsalesDescending, Comparator.reverseOrder());

        // print monthly sales for each shop in descending order
        System.out.println("Monthly sales for Shop A in descending order:");
        for (int sales : shopAsalesDescending) {
            System.out.println(sales);
        }
        System.out.println("Monthly sales for Shop B in descending order:");
        for (int sales : shopBsalesDescending) {
            System.out.println(sales);
        }
    }
}

