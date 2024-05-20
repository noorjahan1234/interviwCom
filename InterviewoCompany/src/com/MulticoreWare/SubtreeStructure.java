package com.MulticoreWare;

import java.util.*;

public class SubtreeStructure {

    public static void findNumSubtreeStructure(int N, int R, Map<Integer, List<Integer>> inputTree, int[] outputSubtreeCount) {
        // Array to keep track of visited nodes
        boolean[] visited = new boolean[N];
        
        // Perform DFS for each node
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i, inputTree, visited, outputSubtreeCount);
            }
        }
    }
    
    private static int dfs(int node, Map<Integer, List<Integer>> inputTree, boolean[] visited, int[] outputSubtreeCount) {
        visited[node] = true;
        int count = 1; // Include the current node
        
        for (int neighbor : inputTree.get(node)) {
            if (!visited[neighbor]) {
                count += dfs(neighbor, inputTree, visited, outputSubtreeCount);
            }
        }
        
        outputSubtreeCount[node] = count;
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int R = scanner.nextInt();
        int N = scanner.nextInt();
        int E = scanner.nextInt();

        Map<Integer, List<Integer>> inputTree = new HashMap<>();
        for (int i = 0; i < N; i++) {
            inputTree.put(i, new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            inputTree.get(node1).add(node2);
            inputTree.get(node2).add(node1);
        }

        int[] outputSubtreeCount = new int[N];
        findNumSubtreeStructure(N, R, inputTree, outputSubtreeCount);

        // Output the subtree counts
        for (int count : outputSubtreeCount) {
            System.out.println(count);
        }

        scanner.close();
    }
}
