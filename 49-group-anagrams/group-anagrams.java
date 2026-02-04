class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> a = new ArrayList<>();
   //    List<String> l = new ArrayList<>();
       HashMap<String,List<String>> map = new HashMap<>();
    //   l.add(strs[i]);
       for(int i =0; i<strs.length;i++){
      char c[] =  strs[i].toCharArray();
      Arrays.sort(c);
      String s = String.valueOf(c);
       
     //  System.out.println(s);
    //   int i =0;
       if(map.get(s) != null){
              List<String> a1 = map.get(s);
              int p = a.indexOf(a1);
              a1.add(strs[i]);
              map.put(s,a1);
             // int p = a.indexOf(a1);
              a.set(p,a1);
       }
       else{
           List<String> l = new ArrayList<String>();
           l.add(strs[i]);
           map.put(s,l);
           a.add(l);
       }
      
      //  a.add(l);
          
       }
     //  s.clear();
       return a;
    }
}