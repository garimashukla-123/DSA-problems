class Solution {
    public int trap(int[] height) {
      int max = height[0];
      int sum = 0;
      for(int i = 1; i<height.length-1; i++){
       //   System.out.println(i);
          if(max == 0){
              max = height[i];
              continue;
          }
          if(max > height[i]){
              if(max <= height[i+1]){
                 // height[i] = max;
                  sum = sum +(max - height[i]);
                  height[i] = max;
                  max = height[i+1];
                  i = i+1;
                //  System.out.println(i+"a");
                //  System.out.println(max);
                  continue;


              }
              else{
                //  for(int j = height[i+1]; j < height.length;j++){
                    int j = i+1;
                 //   System.out.println(j);
                    while(j<height.length){
                      // System.out.println(j);
                      if(max <= height[j]){
                          sum = sum + (max - height[i]);
                          height[i]  = max;
                        //  max = height[j];
                         // continue;
                      //   j++;
                    //  System.out.println(i+"a");
                    //  System.out.println(max);
                         break;
                         // return 0;
                      }
                    //  System.out.println(sum);
                    
                      else{
                          j++;
                      }
                      
                     // System.out.println(j);
                      }
                      if(j==height.length){
                          int k = i+1;
                          int max1 = height[i];
                          while(k<height.length){
                              if(max1< height[k]){
                                  max1 = height[k];
                                  k++;
                                //  sum = sum +(max - height[i]);
                               //   break;
                              }
                              else{
                                  k++;
                              }

                          }
                          sum = sum + (max1 - height[i]);
                          height[i] = max1;
                       
                      max = height[i];
                      continue;
                      }
                  }

              }

          
          else{
              if(max <= height[i]){
              max = height[i];
              System.out.println(max);
              continue;
              }
          }
      } 
      return sum; 
    }
}