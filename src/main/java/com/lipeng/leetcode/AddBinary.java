public class AddBinary {
    public String addBinary(String a, String b) {
        if(a == null || b == null){
            return null;
        }
        
        StringBuffer sb = new StringBuffer();
        
        int aLen = a.length();
        int bLen = b.length();
        if(aLen == 0){
            return b;
        }
        if(bLen == 0){
            return a;
        }
        
        
        
        int flag = 0;
        aLen--;
        bLen--;
        
        while(aLen >= 0 && bLen >= 0){
            if(a.charAt(aLen)==b.charAt(bLen)){
                if(a.charAt(aLen) == '1'){
                    if(flag == 0){
                        flag = 1;
                        sb.append('0');
                    }else{
                        flag = 1;
                        sb.append('1');
                    }
                }else{
                    if(flag == 0){
                        flag = 0;
                        sb.append('0');
                    }else{
                        flag = 0;
                        sb.append('1');
                    }
                }
            }else{
                //  1+0 or 0+1
                if(flag == 0){
                        flag = 0;
                        sb.append('1');
                    }else{
                        flag = 1;
                        sb.append('0');
                    }
                
            }
            
            aLen--;
            bLen--;
        }
        
        if(aLen < 0 && bLen < 0){
            if(flag == 1){
                sb.append('1');
            }
            
            return sb.reverse().toString();
        }
        
        String tmp = null;
        int len = 0;
        if(aLen < 0){
            tmp = b;
            len = bLen;
        }
        if(bLen < 0){
            tmp = a;
            len = aLen;
        }
        
        while(len >=0){
            if(tmp.charAt(len) == '1'){
                if(flag == 1){
                    flag = 1;
                    sb.append('0');
                }else{
                    flag = 0;
                    sb.append('1');
                }
                
            }else{
                 if(flag == 1){
                    flag = 0;
                    sb.append('1');
                }else{
                    flag = 0;
                    sb.append('0');
                }
            }
            len --;
        }
        
         if(flag == 1){
                sb.append('1');
            }
            
            return sb.reverse().toString();
        
    }
}
