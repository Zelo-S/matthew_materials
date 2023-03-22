package classes;

public class Test {
    public static void main(String[] args) {
        System.out.println("hallo");
        Animal bear = new Animal(10, "Joe"); // instantiating a object(vs class)
        
        int[][] testArr = new int[5][5];
        
        for(int[] row : testArr){
            for(int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
        
        // 1000 x 1000 = 1,000,000
        
    } 
}

class Animal{
    private int age; // field "age"
    private String name; // field "name"
    
    public Animal(int age, String name){ // this is our constructor
        this.age = age; // "this" will refer to the FIELD, NOT THE PARAMETER PASSED IN
        this.name = name;
    }
    
}
