package com.self_practise;

import java.util.ArrayList;
import java.util.List;

public class RatInAMazeAllPaths {
    public static void main(String... args) {
        int[][] maze = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 1, 1, 0, 0 }, { 0, 1, 1, 1 } };
        int[] di = { 0, 0, -1, 1 };
        int[] dj = { -1, 1, 0, 0 };
        System.out.println(ratInAMaze(maze, di, dj));
    }

    public static List<String> ratInAMaze(int[][] maze, int[] di, int[] dj) {
        int n = maze.length;
        int[][] visited = new int[n][n];
        String path = "";
        List<String> ans = new ArrayList<>();
        String dir = "LRUD";
        solveMaze(maze, visited, 0, 0, di, dj, path, ans, n, dir);
        return ans;
    }

    public static void solveMaze(int[][] maze, int[][] visited, int i, int j, int[] di, int[] dj, String path,
            List<String> ans, int n, String dir) {
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            return;
        }

        visited[i][j] = 1;

        for (int x = 0; x < di.length; x++) {
            int newi = i + di[x];
            int newj = j + dj[x];
            if (isSafe(newi, newj, n, visited, maze)) {
                path += dir.substring(x, x + 1);
                solveMaze(maze, visited, newi, newj, di, dj, path, ans, n, dir);
                path = path.substring(0, path.length() - 1);
            }
        }

        visited[i][j] = 0;

    }

    public static boolean isSafe(int i, int j, int n, int[][] visited, int[][] maze) {
        if ((i >= 0 && i < n) && (j >= 0 && j < n) && visited[i][j] == 0 && maze[i][j] == 1)
            return true;
        else
            return false;
    }

    /*
     * <--------------------- Use this instead of for-loop ---------------------->
     */
    // int newi = i;
    // int newj = j - 1;
    // if (isSafe(newi, newj, n, visited, maze)) {
    // path += "L";
    // solveMaze(maze, visited, newi, newj, di, dj, path, ans, n, dir);
    // path = path.substring(0, path.length() - 1);
    // }

    // newi = i;
    // newj = j + 1;
    // if (isSafe(newi, newj, n, visited, maze)) {
    // path += "R";
    // solveMaze(maze, visited, newi, newj, di, dj, path, ans, n, dir);
    // path = path.substring(0, path.length() - 1);
    // }

    // newi = i - 1;
    // newj = j;
    // if (isSafe(newi, newj, n, visited, maze)) {
    // path += "U";
    // solveMaze(maze, visited, newi, newj, di, dj, path, ans, n, dir);
    // path = path.substring(0, path.length() - 1);
    // }

    // newi = i + 1;
    // newj = j;
    // if (isSafe(newi, newj, n, visited, maze)) {
    // path += "D";
    // solveMaze(maze, visited, newi, newj, di, dj, path, ans, n, dir);
    // path = path.substring(0, path.length() - 1);
    // }
}
