public class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s == null){
            return 0;
        }
        
        int ret = 0;
        
        int sLen = s.length()-1;
        int status  = 0;
        
        for(int i = sLen; i>=0; i--){
            if(status == 0){
                if(s.charAt(i) == ' '){
                    continue;
                }else{
                    status = 1;
                    ret++;
                }
            }else{
                 if(s.charAt(i) == ' '){
                    break;
                }else{
                    ret++;
                }
            }
        }
        
        return ret;
    }
}
