class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         LinkedList<Integer> adj[]=new LinkedList[numCourses];
        for(int i=0;i<numCourses;i++)
            adj[i]=new LinkedList<>();
        
        for(int i=0;i<prerequisites.length;i++){
            int u=prerequisites[i][0];
            int v=prerequisites[i][1];
            adj[v].add(u);
        }
        boolean visited[]=new boolean[numCourses];
        boolean visitedDFS[]=new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
          if(!visited[i]){
              if(Solve(adj,i,visited,visitedDFS))
                return false;
          }
        }
        return true;
    }
    private static boolean Solve( LinkedList<Integer> adj[],int node,boolean visited[],boolean visitedDFS[]){
        visited[node]=true;
        visitedDFS[node]=true;
        
        for(Integer it:adj[node]){
            if(visited[it]==false){
                if(Solve(adj,it,visited,visitedDFS))
                    return true;
               }
            else if(visitedDFS[it]==true)
                return true;
        }
        visitedDFS[node]=false;
        return false;
    }
}