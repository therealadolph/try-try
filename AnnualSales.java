public class AnnualSales {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        // to calculate annual sales for Shop A
        int shopAannualSales = 0;
        for (int sales : shopAsales) {
            shopAannualSales += sales;
        }

        // here calculate annual sales for Shop B
        int shopBannualSales = 0;
        for (int sales : shopBsales) {
            shopBannualSales += sales;
        }

        // over here weprint annual sales for each shop
        System.out.println("Annual sales for Shop A: " + shopAannualSales);
        System.out.println("Annual sales for Shop B: " + shopBannualSales);
    }
}
