public class IntArray {

    public static void main(String[] args) {
        
       print2d(printSquareArray(4));


    }

    public static void print2d(int[][] a) {

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                System.out.print(a[row][column] + " "); }
                System.out.println();
    }}


    public static int[][] printSquareArray() {
        int number = 4; 
        int[][] array = printSquareArray(4);
        return array;
    }
    //overload version
    public static int[][] printSquareArray(int sideLength) {

       
        int [][] newArray = new int[sideLength][sideLength];
        
        int count = 1; 

        for (int row = 0; row < sideLength; row++)
            for (int col = 0; col < newArray[row].length; col++) {
                newArray[row][col] = count; 
                count += 1; }
        return newArray; 

     
    

    }
}


//int[] ns = new int[6]; 
//int[][] grid = new int[3][4]; 

