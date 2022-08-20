//Backtracking introduction


package com.abir;

import java.util.Arrays;

public class allPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        count("",maze,0,0);
        int[][] path = new int[maze.length][maze[0].length];
        countPrint("",maze,0,0,path,1);
    }

    static void count(String p,boolean[][] maze , int r, int c){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) return;

        maze[r][c] = false;

        if (r < maze.length - 1) {
            count(p + 'D', maze, r+1, c);
        }

        if (c < maze[0].length - 1) {
            count(p + 'R', maze, r, c+1);
        }

        if (r > 0) {
            count(p + 'U', maze, r-1, c);
        }

        if (c > 0) {
            count(p + 'L', maze, r, c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }


    static void countPrint(String p,boolean[][] maze , int r, int c,int[][] path,int steps){
        if (r == maze.length - 1 && c == maze[0].length - 1){
            path[r][c] = steps;
            for (int[] arr: path){

                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if (!maze[r][c]) return;

        maze[r][c] = false;
        path[r][c] = steps;
        if (r < maze.length - 1) {
            countPrint(p + 'D', maze, r+1, c,path,steps+1);
        }

        if (c < maze[0].length - 1) {
            countPrint(p + 'R', maze, r, c+1,path,steps+1);
        }

        if (r > 0) {
            countPrint(p + 'U', maze, r-1, c,path,steps+1);
        }

        if (c > 0) {
            countPrint(p + 'L', maze, r, c-1, path, steps+1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] =0;
    }
}
