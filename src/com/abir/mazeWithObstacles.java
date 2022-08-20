package com.abir;

public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {false, false, true},
                {true, true, true}
        };
        pathWithObstacles("",maze,0,0);

    }

    static void pathWithObstacles(String p, boolean[][] maze, int r,int c){
        if (r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[r][c]) return;

        if (r < maze.length-1){
            pathWithObstacles(p+'D',maze,r+1,c);
        }
        if (c < maze[0].length-1){
            pathWithObstacles(p+'R',maze,r,c+1);
        }

    }
}
