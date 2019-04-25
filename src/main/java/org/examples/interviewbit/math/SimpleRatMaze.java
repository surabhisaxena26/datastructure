package org.examples.interviewbit.math;

/**
 * Created by surabhi on 30.12.2016.
 */
public class SimpleRatMaze {

    static int[] possibleXMoves={0     ,0  ,-1 ,1  };
    static int[] possibleYMoves={-1    ,1  ,0  ,0  };

    public static boolean isSafeMove(int[][] maze, int moveX, int moveY, int N){
        // 0 depicts dead cells
        // 4 depicts that no path to destination exists from moveX, moveY coordinate
        // 3 depcits path of current solution
        return moveX>-1 && moveX<N && moveY>-1 && moveY<N && maze[moveX][moveY]==1;
    }
    public static boolean solveMaze(int[][] maze, int currentXPos, int currentYPos, int N){
        System.out.println("At path: "+ currentXPos+ ", "+ currentYPos);
        if(currentXPos == N-1 && currentYPos == N-1)
            return true;
        // mark current position as a step in the path to destination
        maze[currentXPos][currentYPos]=3;
        boolean solutionExists=false;
        for(int i=0;i<4;i++){
            if(isSafeMove(maze,currentXPos+possibleXMoves[i], currentYPos+possibleYMoves[i],N))
                solutionExists= solutionExists || solveMaze(maze,currentXPos+possibleXMoves[i], currentYPos+possibleYMoves[i],N);
        }
        if(!solutionExists)
            maze[currentXPos][currentYPos]=4;
        return solutionExists;
    }

    public static void main(String[] args){
        int[][] rateMaze={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}};

        solveMaze(rateMaze,0,0,4);
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print(rateMaze[i][j]);
            }
            System.out.println();
        }
        System.out.println(rateMaze);

    }
}
