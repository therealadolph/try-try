public class QuarterlySales {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        // here, we consider the calculation of quarterly sales for ShopA
        int[] shopAquarters = new int[4];
        for (int i = 0; i < 12; i += 3) {
            shopAquarters[i / 3] = shopAsales[i] + shopAsales[i + 1] + shopAsales[i + 2];
        }

        // here, we calculate quarterly sales for ShopB
        int[] shopBquarters = new int[4];
        for (int i = 0; i < 12; i += 3) {
            shopBquarters[i / 3] = shopBsales[i] + shopBsales[i + 1] + shopBsales[i + 2];
        }

        // then we print quarterly sales for both shops
        System.out.println("Quarterly sales for Shop A:");
        for (int quarter : shopAquarters) {
            System.out.println(quarter);
        }
        System.out.println("Quarterly sales for Shop B:");
        for (int quarter : shopBquarters) {
            System.out.println(quarter);
        }
    }
}
