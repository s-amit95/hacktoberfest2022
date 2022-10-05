/*
Java code to impelement Disjoint set union.
*/
import java.util.Scanner;

class DSU {
    int[] rank, parent;
    int n;

    public DSU(int n) {
        rank = new int[n];
        parent = new int[n];
        this.n = n;
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }

        return parent[x];
    }

    void union(int x, int y) {
        int xRoot = find(x), yRoot = find(y);
        if (xRoot == yRoot)
            return;
        if (rank[xRoot] < rank[yRoot])
            parent[xRoot] = yRoot;
        else if (rank[yRoot] < rank[xRoot])
            parent[yRoot] = xRoot;

        else {
            parent[yRoot] = xRoot;
            rank[xRoot] = rank[xRoot] + 1;
        }
    }
}

class DSU_Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), r = sc.nextInt(), q = sc.nextInt();

        int[][] relations = new int[r][2];
        for (int i = 0; i < r; i++) {
            relations[i][0] = sc.nextInt();
            relations[i][1] = sc.nextInt();
        }
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }
        DSU ds = new DSU(c + 1);

        for (int[] ele : relations)
            ds.union(ele[0], ele[1]);

        for (int[] ele : queries) {
            if (ds.find(ele[0]) == ds.find(ele[1]))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        sc.close();
    }

}
