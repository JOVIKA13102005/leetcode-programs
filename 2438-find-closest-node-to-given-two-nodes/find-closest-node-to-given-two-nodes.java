import java.util.*;

class Solution {

    private List<List<Integer>> buildAdj(int[] edges) {
        int numNodes = edges.length;
        List<List<Integer>> adj = new ArrayList<>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < numNodes; i++) {
            if (edges[i] != -1) {
                adj.get(i).add(edges[i]);
            }
        }
        return adj;
    }

    private int[] bfs(int startNode, int numNodes, List<List<Integer>> adj) {
        int[] dist = new int[numNodes];
        Arrays.fill(dist, -1);

        if (startNode < 0 || startNode >= numNodes) {
            return dist;
        }

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startNode);
        dist[startNode] = 0;

        while (!queue.isEmpty()) {
            int u = queue.poll();
            int d = dist[u];

            for (int v : adj.get(u)) {
                if (dist[v] == -1) {
                    dist[v] = d + 1;
                    queue.offer(v);
                }
            }
        }
        return dist;
    }

    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int numNodes = edges.length;
        List<List<Integer>> adj = buildAdj(edges);

        int[] dist1 = bfs(node1, numNodes, adj);
        int[] dist2 = bfs(node2, numNodes, adj);

        int minMaxDistance = Integer.MAX_VALUE;
        int resultNode = -1;

        for (int i = 0; i < numNodes; i++) {
            if (dist1[i] != -1 && dist2[i] != -1) {
                int currentMaxDistance = Math.max(dist1[i], dist2[i]);

                if (currentMaxDistance < minMaxDistance) {
                    minMaxDistance = currentMaxDistance;
                    resultNode = i;
                } else if (currentMaxDistance == minMaxDistance) {
                    resultNode = Math.min(resultNode, i);
                }
            }
        }
        return resultNode;
    }
}