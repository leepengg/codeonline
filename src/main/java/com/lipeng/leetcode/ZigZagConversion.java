public class Solution {
    public String convert(String s, int nRows) {
        if(s == null){
            return null;
        }
        
        List<StringBuilder> ret = new ArrayList<StringBuilder>();
        for(int i = 0; i< nRows; i++){
            ret.add(new StringBuilder());
        }
        
        int len = s.length();
        int j = 0;
        
        while(j < len){
            for(int i = 0; i<nRows && j < len;i++){
                ret.get(i).append(s.charAt(j++));
            }
            for(int i = nRows-2; i>0 && j < len; i--){
                ret.get(i).append(s.charAt(j++));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< nRows; i++){
            sb.append(ret.get(i));
        }
        
        return sb.toString();
        
    }
}
