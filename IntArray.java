public class IntArray {

    public static void main(String[] args) {
        
       print2d(printSquareArray(4));


    }

    public static void print2d(int[][] a) {

        String dashes = "";

        int width = a[0].length;
    
        for (int i =0; i < width; i++)
            dashes += "----";
                 



        System.out.println(dashes);

        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[row].length; column++) {
                
                if (a[row][column] > 9)
                    System.out.print("|" + a[row][column] + " ");
                if (a[row][column] < 10)
                    System.out.print("| " + a[row][column] + " ");
                if (column == a.length-1)
                    System.out.println("|"); }

                
                
                 System.out.println(dashes);
                
                
                 } 
               
    }


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
        return newArray; }
        
}


