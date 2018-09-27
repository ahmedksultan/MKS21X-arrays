public class ArrayDemo {
     //main method
     public static void main(String[]args) {
     }
     //0a - 1D array of ints
     public static void printArray(int[]ary) {
          //initializing array
          ary = new int[11];
          //filling array w/ values
          for ( int i = 0; i < 11; i++ ) {
               ary[i] = i * 10;
          }
          //printing 1D array
          for ( int i = 0; i < 11; i++ ) {
               int b = ary[i];
               System.out.println(b);
          }
     }
     //0b - 2D array of ints
     public static void printArray(int[][]ary) {
          //initializing array
          int[][] ary = new int[4][4];
          //filling array w/ values
          for ( int r = 0; r < 4; r++ ) {
               for ( int c = 0; c < 4; c++ ) {
                    ary[r][c] = ( r * 2 ) + (c);
               }
          }
          //printing 2D array
          for ( int r = 0; r < 4; r++ ) {
               for ( int c = 0; c < 4; c++ ) {
                    //???? i forgot how to do this
     }
}
