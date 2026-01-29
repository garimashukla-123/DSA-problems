class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

      int n = citations.length;
      for(int i = 0; i<n;i++){
      int h =  citations[i];  
      int count = n - i;
      if(count > h){
        continue;
      }
      else {
        return count;
      }

    }
    return 0;
    }
}