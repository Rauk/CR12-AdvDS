package pckg1;

import java.util.List;

/**
 * Created by raunak.agarwal on 16/04/16.
 */
public abstract class Graph {
    private int numVertices;
    private int numEdges;

    public Graph() {
        this.numVertices = 0;
        this.numEdges = 0;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void setNumVertices(int numVertices) {
        this.numVertices = numVertices;
    }

    public int getNumEdges() {
        return numEdges;
    }

    public void setNumEdges(int numEdges) {
        this.numEdges = numEdges;
    }

    public void addVertex() {
        implementAddVertex();
        numVertices++;
    }

    public abstract void implementAddVertex();

    public void addEdge(int v, int w) {
        implementAddEdge(v, w);
        numEdges++;
    }

    public abstract void implementAddEdge(int v, int w);

    public abstract List<Integer> getNeighbours (int v);

}
