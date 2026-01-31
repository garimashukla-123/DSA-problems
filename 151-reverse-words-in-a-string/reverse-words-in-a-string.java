class Solution {
    public String reverseWords(String s) {
      String reverse = "";
      int start = 0;
      int last = 0;
    
      s = s.trim();
        int n = s.length();
      int i =n-1;
      while(i>=0){
        
        if(s.charAt(i) == ' '){
            if(s.charAt(i+1) != ' '){
            reverse = reverse + s.charAt(i);
            i--;
            continue;
            }
            else{
                i--;
                continue;
            }
        // last = i-1;
      }  
      else{
        //  
        last = i;
        start = i;
        // if(last == 0 && start )
        int j = i-1;
        if(j < 0){
           reverse = reverse + s.substring(start,last+1);  
        }
        while(j>=0){
        // for(int j = i-1; j >=0; j--){
            if(s.charAt(j)==' ' || j == 0){
                if(j == 0){
                    start = j;
                  
                }
            else{
              
               
                start = j+1;
              
            }
                
                reverse = reverse + s.substring(start,last+1);
                // System.out.println(reverse);
                i = start;
                
                break;
             
            }
           j--;
            
        }
        i--;
      }
      }
      return reverse;
    }
}