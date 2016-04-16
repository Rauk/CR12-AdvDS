package pckg1Impl;

import pckg1.Graph;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by raunak.agarwal on 16/04/16.
 */
public class GraphAdjMatrix extends Graph {

    private int[][] adjMatrix;

    public void implementAddVertex() {
        int v = getNumVertices();
        if (v >= adjMatrix.length) {
            int[][] newAdjMatrix = new int[2 * v][2 * v];
            for (int i = 0; i < adjMatrix.length; i++) {
                for (int j = 0; i < adjMatrix.length; i++) {
                    newAdjMatrix[i][j] = adjMatrix[i][j];
                }
            }
            adjMatrix = newAdjMatrix;
        }
    }

    public void implementAddEdge(int v, int w) {
        if (adjMatrix[v][w] > 0) {
//            setNumEdges(getNumEdges() - adjMatrix[v][w]);
            setNumEdges(getNumEdges() - 1); // here itdepends upon the weighted edge and repeated edge kind of things
            return;
        }
        adjMatrix[v][w] = 1;
    }

    public List<Integer> getNeighbours(int v) {
        List<Integer> neighbours = new ArrayList<Integer>();
        for (int i = 0; i < adjMatrix.length; i++) {
            if (adjMatrix[v][i] == 1) {
                neighbours.add(i);
            }
        }
        return neighbours;
    }
}
