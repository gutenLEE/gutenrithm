class Solution {
public int findCenter(int[][] edges) {
        int ans[] = new int[edges.length + 1];
        for( int[] edge : edges ){
            int a = edge[0];
            int b = edge[1];
            
            ans[a - 1]++;
            ans[b - 1]++;
        }
        
        int res = 0;
        for( int i = 0; i < ans.length; i++){
            if (ans[i] > 1) return res = i + 1;
        }
        return res;
    }
}