package com.algoexpert.algoexpert.riversizes;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {

    public static List<Integer> riverSizes(int[][] matrix){
        // initialize a list for storing the river sizes
        // initialize a matrix of boolean values to record visited values

        List<Integer> sizesList = new ArrayList<>();
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < visited.length; i++) {
            for (int j = 0; (j) < visited[0].length ; (j)++) {
                // if node has been visited, then don't bothwr.
                if(visited[i][j]){
                    continue;
                }
                // otherwise, let's traverse it's neighbors
                traverseNode(i, j, matrix, visited, sizesList);
            }

        }

        return sizesList;
    }

    public static void traverseNode(int i, int j, int[][] matrix, boolean[][] visited,
                                    List<Integer> sizes){
        int currentRiverSize = 0;
        // each item in the yetToExplore list is an x,y or i,j coordinate.
        // it corresponds to the coordinates of a value we have not yet visited.
        List<Integer[]> yetToExplore = new ArrayList<Integer[]>();
        yetToExplore.add(new Integer[]{i,j});
        while (!yetToExplore.isEmpty()) {
            /** Extract the i,j coordinates as 'currentNode' */
            Integer[] currentNode = yetToExplore.get(yetToExplore.size()-1);
            /** Remove the item from yet to explore*/
            yetToExplore.remove(yetToExplore.size()-1);
            /** Extract the 'i' into i, 'j' into j*/
            i = currentNode[0];
            j = currentNode[1];
            /** Check if it's been visited. SKip it if it has.*/
            if (visited[i][j]){
                continue;
            }
            /** Else, visit and record our visit to this i,j coordinate */
            visited[i][j] = true;

            /** If the corresponding position of the matrix contains 0, then don't traverse it's neighbors. */
            if (matrix[i][j] == 0){
                continue;
            }
            /** Otherwise, increment the size of curent river. */
            currentRiverSize++;
            /** Determine how many of the current node's neighbors have been visited*/
            List<Integer[]> unvisitedNeighbors = getUnvisitedNeighbors(i, j, matrix, visited);
            /** Traverse the unvisited neighbors and add to yetToExplore*/
            for (Integer[] neighbor : unvisitedNeighbors) {
                yetToExplore.add(neighbor);
            }
            /** Add the river size to the sizes list.*/
            if (currentRiverSize > 0) {
                sizes.add(currentRiverSize);
            }
        }
    }

    public static List<Integer[]> getUnvisitedNeighbors(int i, int j, int[][] matrix, boolean[][] visited){
        List<Integer[]> unvisitedNeighbors = new ArrayList<Integer[]>();

        /** i corresponds to the row, j to the column. So below, we look above, below, left and right of
         * the current node at i, j and determine if it's been visited.
         * If it has not been, then we add it to the
         * */
        if (i > 0 & !visited[i-1][j]){
            unvisitedNeighbors.add(new Integer[]{i - 1, j});
        }
        if (i < matrix.length - 1 && !visited[i+1][j]){
            unvisitedNeighbors.add(new Integer[]{i + 1, j});
        }
        if (j > 0 && !visited[i][j - 1]) {
            unvisitedNeighbors.add(new Integer[]{i, j - 1});
        }
        if (j < matrix[0].length && !visited[i][j + 1]) {
            unvisitedNeighbors.add(new Integer[]{i, j + 1});
        }

        return unvisitedNeighbors;
    }
}

