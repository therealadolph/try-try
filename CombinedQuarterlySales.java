public class CombinedQuarterlySales {
    public static void main(String[] args) {
        int[] shopAsales = {42, 52, 46, 50, 48, 58, 49, 51, 50, 60, 58, 61};
        int[] shopBsales = {57, 70, 67, 72, 63, 67, 65, 69, 60, 73, 62, 75};

        // we calculate the  quarterly sales for Shop A first to make it more simplier to call it in the rest of the code
        int[] shopAquarters = new int[4];
        for (int i = 0; i < 12; i += 3) {
            shopAquarters[i / 3] = shopAsales[i] + shopAsales[i + 1] + shopAsales[i + 2];
        }

        // we calculate quarterly sales for Shop B (same reason here too hehhe)
        int[] shopBquarters = new int[4];
        for (int i = 0; i < 12; i += 3) {
            shopBquarters[i / 3] = shopBsales[i] + shopBsales[i + 1] + shopBsales[i + 2];
        }

        // here we just call it from the mathematical cal above calculate combined quarterly sales for both shops
        int[] combinedQuarters = new int[4];
        for (int i = 0; i < 4; i++) {
            combinedQuarters[i] = shopAquarters[i] + shopBquarters[i];
        }

        // we  print quarterly sales for both shops
        System.out.println("Quarterly sales for Shop A:");
        for (int quarter : shopAquarters) {
            System.out.println(quarter);
        }
        System.out.println("Quarterly sales for Shop B:");
        for (int quarter : shopBquarters) {
            System.out.println(quarter);
        }
        System.out.println("Combined quarterly sales for both shops:");
        for (int quarter : combinedQuarters) {
            System.out.println(quarter);
        }
    }
}
