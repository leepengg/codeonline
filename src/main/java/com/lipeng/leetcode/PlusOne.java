public class PlusOne {
    public int[] plusOne(int[] digits) {
        if(digits == null){
            return null;
        }
        
        int len = digits.length;
        int [] ret = new int[len+1];
        
        int flag = 1;
        len--;
        
        while(len >=0){
            if(digits[len] == 9){
                if(flag == 1){
                    flag = 1;
                    ret[len+1] = 0;
                }else{
                    flag = 0;
                    ret[len+1] = 9;
                }
            }else{
                ret[len+1] = digits[len] + flag;
                flag = 0;
            }
            
            len --;
        }
        
        ret[0] = flag;
        
        if(flag == 1){
            return ret;
        }else{
            return Arrays.copyOfRange(ret, 1, ret.length);
        }
        
    }
}
