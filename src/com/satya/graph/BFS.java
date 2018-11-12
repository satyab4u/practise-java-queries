package com.satya.graph;

import java.util.LinkedList;

/**
 * Created by Satya on 10/30/18.
 */
class Graph {

    private int V;

    private LinkedList<Integer> adj[];

    Graph(int v){

        this.V=v;

        adj=new LinkedList[V];

        for (int i=0;i<V;i++){
            adj[i]=new LinkedList<>();
        }

    }

    void addEdge(int src,int dest){
        adj[src].add(dest);
        adj[dest].add(src);
    }

    void printGraph(){

        for (int i=0;i<V;i++){
            System.out.print("head");

            for (Integer value:adj[i]){
                System.out.print("--->"+value);
            }
            System.out.println("\n");
        }

    }

    public static void main(String arg[]){

        Graph g=new Graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();

    }




}
