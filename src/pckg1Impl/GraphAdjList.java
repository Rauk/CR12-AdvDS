package pckg1Impl;

import pckg1.Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by raunak.agarwal on 16/04/16.
 */
public class GraphAdjList extends Graph {
    private Map<Integer, ArrayList<Integer>> adjListsMap;

    @Override public void implementAddVertex() {
        int v = getNumVertices();
        ArrayList<Integer> neighbours = new ArrayList<Integer>();
        adjListsMap.put(v, neighbours);
    }

    @Override public void implementAddEdge(int v, int w) {
        (adjListsMap.get(v)).add(w);
//        adjListsMap.put(v, (adjListsMap.get(v)).add(w));
    }

    @Override public List<Integer> getNeighbours(int v) {
//        return adjListsMap.get(v);
        return new ArrayList<Integer>(adjListsMap.get(v));
    }
}
