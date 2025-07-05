class Solution {
    public int orangesRotting(int[][] grid) {
        int [][]direction = {{-1,0},{0,1},{1,0},{0,-1}};
         int cols = grid[0].length; 
       int rows = grid.length;
       int freshoranges = 0;  
     int count = 0;
    //   Garima
        class Node{
            int i1;
            int j1;
            int time;
            public Node(int r, int c, int t){
                this.i1 = r;
                this.j1 = c;
                this.time = t;
            }
        }
      
        Queue<Node> q = new LinkedList<>();
           
               for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 2) {
                    q.add(new Node(i, j, 0));
                }
                 else if(grid[i][j] == 1) {
                    freshoranges += 1;
                }
            }
        }

            while(!q.isEmpty()){
               Node n = q.poll();
                for(int k = 0; k < direction.length ; k++){
                int  p = n.i1 + direction[k][0];
                int  q1 = n.j1 + direction[k][1];

               if(p >= 0 && p < grid.length && q1 >= 0 && q1 < grid[0].length){
                if(grid[p][q1] == 1){
                q.add(new Node(p,q1, n.time+1));
                  
                    grid[p][q1] = 2;
                    count = n.time +1;
                    freshoranges -= 1;
                 
                  }
               }  

            }

            }

        
       
           return freshoranges == 0 ? count : -1;
    
    }
}