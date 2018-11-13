package com.satya;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Satya on 11/13/18.
 */
public class GraphHack {
    private HashSet<Integer> nodeLookUp=new HashSet<>();

    public static class Node {
        int id;
        LinkedList<Node> adjacent=new LinkedList<>();
        private Node(int id){
            this.id=id;
        }
    }

    public Node getNode(int id){
        return new Node(id);
    }

    public void addEdge(int source,int destination) {
        Node src=getNode(source);
        Node dest=getNode(destination);
        src.adjacent.add(dest);
    }

    public boolean hasPathDFS(int source,int destination) {
        Node s=getNode(source);
        Node d=getNode(destination);
        HashSet<Integer> visited=new HashSet<>();
        return hasPathDFS(s,d,visited);
    }

    private boolean hasPathDFS(Node source,Node destination,HashSet<Integer> visited) {
        if(visited.contains(source.id)){
            return false;
        }
        visited.add(source.id);
        if(source == destination) {
            return true;
        }

            for(Node child:source.adjacent) {
               if (hasPathDFS(child, destination, visited)){
                   return true;
               }
            }

        return false;
    }

    public boolean hasPathBFS(Node source,Node destination) {
        LinkedList<Node> nextToVist=new LinkedList<>();
        Set<Integer> visited=new HashSet<>();
        nextToVist.add(source);
        while(!nextToVist.isEmpty()) {
            Node node=nextToVist.remove();
            if(node == destination) {
                return true;
            }
            if(visited.contains(node.id)) {
                continue;
            }
            visited.add(node.id);
            for (Node child: node.adjacent) {
                nextToVist.add(child);
            }
        }
        return false;
    }

}
