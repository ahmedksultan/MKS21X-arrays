public class ArrayDemo {
     //main method
     public static void main(String[]args) {
          //-- Oa - PRINT 1D STRING --
          //intializing ary
          int[] ary;
          ary = new int[11];
          //filling ary
          for (int i = 0; i < 11; i++) {
               ary[i] = i * 10;
          }
          //running 0a (ary)
          printArray(ary);

          //-- Ob - PRINT 2D STRING --
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
               for (int j = 0; j < (ary[i]).length; j++) {
                    System.out.print(ary[i][j] + " ");
               }
          }
     }
}
