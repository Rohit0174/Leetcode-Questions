class Solution {
    public boolean canFinish(int V, int[][] prerequisites) {
       ArrayList<Integer> adj[]=new ArrayList[V];
        for(int i=0;i<V;i++){
            adj[i]=new ArrayList<>();
        }
        
        for(int i=0;i<prerequisites.length;i++){
            int fv=prerequisites[i][0];
            int sv=prerequisites[i][1];
            adj[sv].add(fv);
        }
        boolean visited[]=new boolean[V];
        boolean visitedDFS[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(Solve(adj,visited,visitedDFS,i))return false;
            }
        }
        return true;
    }
    private boolean Solve(ArrayList<Integer> adj[],boolean visited[],boolean visitedDFS[],int node){
        visited[node]=true;
        visitedDFS[node]=true;
        
        for(Integer it:adj[node]){
            if(visited[it]==false){
                if(Solve(adj,visited,visitedDFS,it))return true;
            }
            else if(visitedDFS[it]==true)
                return true;
        }
        visitedDFS[node]=false;
        return false;
    }
}