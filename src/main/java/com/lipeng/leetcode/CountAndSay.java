public class CountAndSay {
    
    private String countAndSay(String s){
        int len = s.length();
        
        StringBuffer sb = new StringBuffer();
        
        int i = 0;
        while(i < len){
            char c = s.charAt(i);
            int j = 1;
            i++;
            
            while(i < len){
                if(s.charAt(i) == c){
                    j++;
                    i++;
                }else{
                    break;
                }
            }
            
             sb.append(j).append(c);
            
        }
         
         return sb.toString();   
        }
        
        
    
    public String countAndSay(int n) {
        
        if(n == 1){
            return "1";
        }

        return countAndSay(countAndSay(n-1));
        
    }
    
}
