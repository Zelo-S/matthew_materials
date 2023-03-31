public class MazeNavig {
    public static void main(String[] args) {
        int[][] maze = {
            {0, 1, 1, 1},
            {0, 0, 1, 1},
            {1, 0, 1, 1},
            {1, 0, 0, 0}
        };
        
        int row=0, col=0;
        while(row < maze.length && col < maze.length){
            if(row+1 < maze.length && maze[row+1][col] == 0){
                
            }
            if(col+1 < maze.length && maze[row][col+1] == 0){

            }
        }
    } 
}
