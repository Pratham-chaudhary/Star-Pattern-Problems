public class butterfly_pattern {
    public static void main(String[] args) {
         int n =5;
         //upper half
         for(int i=1; i<=n; i++){

             //1st part odf star
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             //Print space
             int space = 2*(n-i);
             for(int j=1; j<=space; j++){
                 System.out.print(" ");
             }
             //2nd part print
             for(int j=1; j<=i; j++){
                 System.out.print("*");
             }
             System.out.println();
         }
         //lower half of butterfly copy above code and change n to 1
        for(int i=n; i>=1; i--){

            //1st part of star
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            //Print space
            int space = 2*(n-i);
            for(int j=1; j<=space; j++){
                System.out.print(" ");
            }
            //2nd part print
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 OUTPUT

*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *


  */
