class Solution {
    
    public HashMap<String, Boolean> map = new HashMap<String,Boolean>();
    public boolean isInterleave(String s1, String s2, String s3) {
        
        
        if (s1.length() == 0 && s2.length() == 0 && s3.length() == 0) {
            return true;
        }
 
        if (s3.length() == 0) {
            return false;
        }
 
        String key = (s1 + "|" + s2 + "|" + s3);
        
        if(!map.containsKey(key)){
            boolean x = (s1.length() != 0 && s3.charAt(0) == s1.charAt(0)) && (isInterleave(s1.substring(1), s2, s3.substring(1)));


            boolean y = (s2.length() != 0 && s3.charAt(0) == s2.charAt(0)) && (isInterleave(s1, s2.substring(1), s3.substring(1)));
            
            map.put(key,x||y);
        }
        
        return map.get(key);
        
    }
}
