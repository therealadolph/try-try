
public class GrandAnnual  {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        // calculate annual sales for Shop A
        int shopAannualSales = 0;
        for (int sales : shopAsales) {
            shopAannualSales += sales;
        }

        // calculate annual sales for Shop B
        int shopBannualSales = 0;
        for (int sales : shopBsales) {
            shopBannualSales += sales;
        }

        // calculate grand annual combined sales for both shops
        int grandAnnualSales = shopAannualSales + shopBannualSales;

        // print annual sales for each shop and grand annual combined sales
        System.out.println("Annual sales for Shop A: " + shopAannualSales);
        System.out.println("Annual sales for Shop B: " + shopBannualSales);
        System.out.println("Grand annual combined sales: " + grandAnnualSales);
    }
}
