public class ArrayDemo {
     //main method
     public static void main(String[]args) {
          //-- Oa - PRINT 1D ARRAY --
          //intializing ary
          int[] ary;
          ary = new int[11];
          //filling ary
          for (int i = 0; i < 11; i++) {
               ary[i] = i * 10;
          }
          //running 0a (ary)
          System.out.println("0a - printing a 1D array");
          printArray(ary);

          //-- Ob - PRINT 2D ARRAY --
          //initializing marr
          int[][] marr;
          marr = new int[4][4];
          //filling marr
          for (int i = 0; i < 4; i++) {
               for (int j = 0; j < 4; j++) {
                    marr[i][j] = i * j;
               }
          }
          //running 0b (marr)
          System.out.println("\n0b - printing a 2D array");
          printArray(marr);
     }
     //0a - 1D array of ints
     public static void printArray(int[] ary) {
          //printing
          System.out.print("{ ");
          for (int i = 0; i < ary.length; i++) {
               int b = ary[i];
               if (i < ary.length - 1) {
                    System.out.print(b + ", ");
               }
               else {
                    System.out.print(b + " }\n");
               }
          }
     }
     //0b - 2D array of ints
     public static void printArray(int[][] ary) {
          //printing
          System.out.print("{ ");
          for (int i = 0; i < ary.length; i++) {
               if ( i != 0 ) {
                    System.out.print("\n"); }
               for (int j = 0; j < (ary[i]).length; j++) {
                    if ( j < ary.length - 1) {
                         System.out.print(ary[i][j] + ", ");
                    }
                    else {
                         System.out.print(ary[i][j] + " ");
                    }
               }
          }
          System.out.print(" }\n");
     }
     //1 - calculate and return how many 0s in the parameter
     public static int countZeros2D(int[][] nums) {
          int cz = 0;
          for (int i = 0; i < nums.length; i++) {
               for (int j = 0; j < (nums[i]).length; j++) {
                    if ((nums[i][j]) == 0) {
                         cz += 1;
                    }
               }
          }
          return cz;
     }
     /* 2a - modify a given 2D array as follows:
     replace all values w/ ones, EXCEPT
     row = column, fill with threes */
     public static void fill2D(int[][] vals) {
          for (int i = 0; i < vals.length; i++) {
               for (int j = 0; j < (vals[i]).length; j++) {
                    if ( i == j ) {
                         vals[i][j] = 3;
                    }
                    else {
                         vals[i][j] = 1;
                    }
               }
          }
     }
     /* 2b - make a new 2D array w/ same
     dimensions as a given parameter; fill array w/
     1s, unless orig array value is negative
     fill w/ 3s */
     public static int[][] fill2DCopy(int[][] vals) {
          int rowL = vals.length;
          int colL = vals[i].length;
          //creating a new 2D array
          int[][] valsCopy;
          valsCopy = new int[rowL][colL];
          //filling valsCopy
          for (int i = 0; i < rowL; i++) {
               for (int j = 0; j < colL; j++) {
                    if vals[i][j] < 0 {
                         valsCopy[i][j] = 3;
                    }
                    else {
                         valsCopy[i][j] = 1;
                    }
               }
          }
          printArray(int[][] valsCopy);
     }
}
