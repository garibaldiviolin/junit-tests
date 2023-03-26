package com.garibaldi.junittests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;
import java.util.Collections;

public class BreadthFirstSearch {

    public static ArrayList<String> search(String startNode, String endNode, HashMap<String, String[]> graph) throws NullPointerException {

        if (graph == null)
            throw new NullPointerException("Graph pointer is null.");

        ArrayList<String> path = new ArrayList<String>();
        Stack<String> nextNodes = new Stack<String>();
        HashSet<String> visitedNodes = new HashSet<String>();
        HashMap<String, String> reversedRoute = new HashMap<String, String>();
        nextNodes.add(startNode);

        String node = startNode;
        while (nextNodes.size() > 0) {
            node = nextNodes.pop();
            visitedNodes.add(startNode);

            if (node == endNode) {
                break;
            }

            for (String connectedNode: graph.get(node)) {
                reversedRoute.put(connectedNode, node);
                nextNodes.add(connectedNode);
            }
        }

        if (node != endNode)
            return path;

        while (node != null) {
            path.add(node);
            node = reversedRoute.get(node);
        }

        Collections.reverse(path);
        return path;

    }

}
