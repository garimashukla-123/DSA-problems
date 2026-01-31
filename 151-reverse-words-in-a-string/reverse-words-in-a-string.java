class Solution {
    public String reverseWords(String s) {
      String reverse = "";
      int start = 0;
      int last = 0;
    s = " " + s;
 
      int i =s.length()-1;
      while(i>=0){
        if(s.charAt(i) == ' '){
        i--;
        continue;
      }  
      else{  
        last = i;
        start = i;
        
        int j = i-1;
        if(j < 0){
           reverse = reverse + s.substring(start,last+1);  
        }
        while(j>=0){
        // for(int j = i-1; j >=0; j--){
            if(s.charAt(j)==' ' || j == 0){
                start = j;
                
                reverse = reverse + s.substring(start,last+1);
               
                i = start;
                
                break;
             
            }
           j--;
            
        }
        i--;
      }
      }
      reverse = reverse.trim();
      return reverse;
    }
}