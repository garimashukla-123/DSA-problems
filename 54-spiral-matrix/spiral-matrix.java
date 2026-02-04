class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int right = matrix[0].length-1;
      List<Integer> l = new ArrayList<>();
        int index = 0;
        int top = 0;
        int bottom = matrix.length-1;
        //   int[] output = new int[m*n];
            while(top<=bottom  && left <= right){
        // left-to-right
        for(int i = left; i <= right;i++){
            l.add(matrix[top][i]) ;
         
            index++;

        }
      
    
        // top-bottom
        for(int i = top+1; i <= bottom;i++){
              l.add(matrix[i][right]) ;
         
            index++;
            // bottom = i;
        }
        // bottom--;

        // right-to-left
          if (top < bottom) {
    for(int i = right-1; i >= left;i--){
         l.add(matrix[bottom][i]);
        index++;
    }  
          } 
    // bottom-to-top
     if (left < right) {
    for(int i = bottom-1; i> top;i--){
          l.add(matrix[i][left]);
    }
     }
    left++;
    right--;
    top++;
    bottom--;
            }
      return l;  
    }
}