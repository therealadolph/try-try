public class CombinedSales {
    public static void main(String[] args) {
        int[] shopAsales ={42,52,46,50,48,58,49,51,50,60,58,61};
        int[] shopBsales ={57,70,67,72,63,67,65,69,60,73,62,75};
        int[] monthlySales = new int[12];

        //so this part now calculates the combined sales for both Shops A and B
        for (int i =0;i<12;i++){
            monthlySales[i] =shopAsales[i]+ shopBsales[i];
        }

        //here also we calculate the output total sales for the year
        int totalSales =0;
        for (int sales : monthlySales){
            totalSales += sales;
        }
        System.out.println("Total sales for the year:"+ totalSales);
    }
}