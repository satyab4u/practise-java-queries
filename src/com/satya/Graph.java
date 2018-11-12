package com.satya;

import java.util.LinkedList;

/**
 * Created by Satya on 10/30/18.
 */
public class Graph {

    int V;
    java.util.LinkedList<Integer> adj[];

    public Graph(int v){
        this.V=v;
        adj=new LinkedList[v];

        for (int i=0 ; i<V ; i++){
            adj[i]=new LinkedList<>();
        }
    }

    public void addEdge(int src,int dest) {
        adj[src].add(dest);
    }

    public void printGraph() {

        for (int i=0 ; i<V-1 ; i++){
            System.out.print("head");

            for (Integer val : adj[i]){
                System.out.print("-->"+val);
            }
            System.out.print("\n");
        }

    }

    public static void main(String args[]){

        Graph graph= new Graph(4);
        graph.addEdge(0,0);
        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(1,1);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,0);
        graph.addEdge(2,1);
        graph.addEdge(2,2);
        graph.addEdge(2,3);
        graph.printGraph();


    }

}
