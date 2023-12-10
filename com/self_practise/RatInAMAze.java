package com.self_practise;

public class RatInAMAze {

    public static boolean ratInAMaze(int[][] maze) {
        int n = maze.length;
        int[][] path = new int[n][n];
        return solveMAze(maze, path, 0, 0);

    }

    public static boolean solveMAze(int[][] maze, int[][] path, int i, int j) {
        int n = maze.length;
        if (i < 0 || i > n || j < 0 || j > n || maze[i][j] == 0 || path[i][j] == 1)
            return false;
        if (i == n - 1 && j == n - 1) {
            return true;
        }

        path[i][j] = 1;

        if(solveMAze(maze, path, i-1, j)){
            return true;
        }
        if(solveMAze(maze, path, i, j+1)){
            return true;
        }
        if(solveMAze(maze, path, i+1, j)){
            return true;
        }
        if(solveMAze(maze, path, i, j-1)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] maze = new int[][] { { 1, 1, 0 }, { 1, 0, 0 }, { 1, 1, 1 } };
        System.out.println(ratInAMaze(maze));
    }
}
