/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.company.adjacencymatrixgraphsvertices;

/**
 *
 * @author kamau
 */
public class AdjacencyMatrixGraphsVertices {

    public static void main(String[] args) {
        String[] vertexData = {"A", "B", "C", "D"};

        int[][] adjacencyMatrix = {
            {0, 1, 1, 1}, // Edges for A
            {1, 0, 1, 0}, // Edges for B
            {1, 1, 0, 0}, // Edges for C
            {1, 0, 0, 0} // Edges for D
        };
        printAdjacencyMatrix(adjacencyMatrix);
        printConnections(adjacencyMatrix, vertexData);
    }

    public static void printAdjacencyMatrix(int[][] matrix) {
        System.out.println("Adjacency Matrix:");
        for (int[] row : matrix) {
            for (int values : row) {
                System.out.print(values + " ");
            }
            System.out.println();
        }
    }

    public static void printConnections(int[][] matrix, String[] vertices) {
        System.out.println("print the connections to vertices");
        for (int i = 0; i < vertices.length; i++) {
            System.out.print(vertices[i] + ": ");
            for (int j = 0; j < vertices.length; j++) {
                if (matrix[i][j] == 1) {
                    System.out.print(vertices[j] + " ");
                }
            }
                   System.out.println();
        }
  

    }
}
