package com.example.codinginterview.graphsandtrees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph {
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public static class Node {
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id){
            this.id = id;
        }
    }

    private Node getNode(int id){
        return this.nodeLookup.get(id);
    }
    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return hasPathDFS(s, d, visited);
    }

    public boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited){
        // if the source is in visited, then we've visited all the adjacent nodes of source.
        if (visited.contains(source.id)){
            return false;
        }
        // if we ave not visited source yet, add it to visited.
        visited.add(source.id);

        // if source is destination, we found our target node
        if (source == destination){
            return true;
        }

        // otherwise, call hasPathDFS on each node adjacent to the current source.
        // these calls do not happen simultaneously... instead, it moves all the way down the graph on one child before moving down on another.
        for (Node child : source.adjacent){
            if (hasPathDFS(child, destination, visited)){
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination){
        return hasPathBFS(getNode(source), getNode(destination));
    }
    private boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet<>();
        nextToVisit.add(source);

        while (!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if (node == destination){
                return true;
            }

            if (visited.contains(node.id)){
                continue;
            }
            visited.add(node.id);

            for (Node child : node.adjacent){
                nextToVisit.add(child);
            }
        }
        return false;
    }
}
