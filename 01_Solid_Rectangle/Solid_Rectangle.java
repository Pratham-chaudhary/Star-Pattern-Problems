public class solidRectangle {
    public static void main(String[] args) {

        int n = 4;
        int m = 5;

// outer loop traversing rows
        for (int i = 1; i <= n; i++) {
// inner loop printing star in column
            for (int j = 1; j <= m; j++) {

                System.out.print("*");
            }

            System.out.println(" ");
        }
    }

}

/*  OUTPUT

***** 
***** 
***** 
*****   */
