package algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CloneGraph {

    public static void main(String... args) {
        CloneGraph cloneGraph = new CloneGraph();
//        [[2,4],[1,3],[2,4],[1,3]]
        int[][] matrix = new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};

    }

    public Node cloneGraph(Node node) {
        Set<Node> nodeSet = new HashSet<Node>();
        Node cloneNode = new Node(node.val);
        nodeSet.add(cloneNode);

        if (node.neighbors != null) {
            for (Node neighbor : node.neighbors) {
                Node cloneNeighbor = cloneGraph(neighbor);
                if(!nodeSet.contains(cloneNeighbor)){
                    cloneNode.neighbors.add(cloneNeighbor);
                }
            }
        }

        return cloneNode;
    }

    class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
