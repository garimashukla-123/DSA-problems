class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> m = new HashMap<>();
        for(int i =0; i< magazine.length();i++){
            //  if(!m.contains(magazine.chartAt(i))){
        m.put(magazine.charAt(i),m.getOrDefault(magazine.charAt(i),0)+1);
        // }
        }
        for(int i=0;i<ransomNote.length();i++){
            Character ch = ransomNote.charAt(i);
            if(m.getOrDefault(ch,0)==0){
                return false;
            }
                else{
                    m.put(ch,m.get(ch)-1);
                }
                
            
        }
        return true;
       
    }
}