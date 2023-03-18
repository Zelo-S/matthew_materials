
class Test{
    public static void main(String[] args) {
        // "instantiating" a 2-D array
        int[][] arr = new int[3][4]; // all values are set to 0(for int), null(for Object), false(booleans)
        
        arr[1][2] = 5; // up to down selects row, left to right selects column
        System.out.println(arr[1][2]); // outputs 5
        System.out.println(arr[0][2]); // outputs 0
        
        
        // =============
        
        // another way of "instantiating" a 2-D array
        int[][] arrTwo = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        System.out.println(arrTwo[2][1]); // GIVES US 5
        System.out.println(arrTwo.length); // GIVES US # OF ROWS
        System.out.println(arrTwo[0].length); // GIVES US # OF COLUMNS
        
        for(int i=0; i<arrTwo.length; ++i){
            for(int e=0; e<arrTwo[0].length; ++e){
                System.out.print(arrTwo[i][e]);
            }
            System.out.println();
        }
        
        // ============
        
        // GOAL: CREATE 2 4x3 2-D ARRAYS, AND ADD EACH ELEMENT IN THE SAME ROW AND COLUMN --> AND THEN PUT RESULT INTO A NEW 2-D ARRAY        
        int[][] first = {{1,1,1,1},
                         {1,1,1,1},
                         {1,1,1,1}};

        int[][] second = {{2,2,2,2},
                          {2,2,2,2},
                          {2,2,2,2}};
                          
        int[][] third = new int[first.length][first[0].length];
        for(int i=0; i<first.length; ++i){
            for(int e=0; e<first[0].length; ++e){
                third[i][e] = first[i][e] + second[i][e];
            }
        }
        
        for(int i=0; i<third.length; ++i){
            for(int e=0; e<third[0].length; ++e){
                System.out.print(third[i][e]);
            }
            System.out.println();
        }
        
        // ========
        
        // GOAL: 10x10 array, alternate each box with a 0,1,0,1...
        
        int[][] arrThree = new int[10][10];
        boolean is_empty = true;
        for(int i=0; i<arrThree.length; ++i){
            for(int e=0; e<arrThree[0].length; ++e){
                if(is_empty) arrThree[i][e] = 0;
                else arrThree[i][e] = 1;
                is_empty = !is_empty;
            }
        }
        
        for(int i=0; i<arrThree.length; ++i){
            for(int e=0; e<arrThree[0].length; ++e){
                System.out.print(arrThree[i][e]);
            }
            System.out.println();
        }
        
        // =======
        
        
    }
}