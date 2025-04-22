package Graph;

import java.util.*;

public class ImplementOfGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        public static void createGraph(ArrayList<Edge> graph[]) {
            for (int i = 0; i < graph.length; i++) {
                graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0, 2, 2));

            graph[1].add(new Edge(1, 2, 10));
            graph[1].add(new Edge(1, 3, 0));

            graph[2].add(new Edge(2, 0, 2));
            graph[2].add(new Edge(2, 1, 10));
            graph[2].add(new Edge(2, 3, -1));

            graph[3].add(new Edge(3, 1, 0));
            graph[3].add(new Edge(3, 2, -1));
        }

        public static void bfs(ArrayList<Edge> graph[], int v, boolean[] vis, int start) {
            Queue<Integer> que = new LinkedList<>();

            que.add(start);

            while (!que.isEmpty()) {
                int curr = que.remove();
                if (vis[curr] == false) {
                    System.out.print(curr + " ");
                    vis[curr] = true;

                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        que.add(e.dest);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[4];
        Edge.createGraph(graph);

        boolean vis[] = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (vis[i] == false) {
                Edge.bfs(graph, 4, vis, i);
            }
        }
    }
}
