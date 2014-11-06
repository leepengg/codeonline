public class Solution {
    
    public int findMin(int[] num) {
        int begin = 0;
        int end = num.length -1;
        
        if(num[begin] < num[end]){
            return num[begin];
        }
        if(begin == end){
            return num[begin];
        }
        
        while(begin < end){
            if((end - begin) == 1){
               return (num[begin] > num[end]) ? num[end]:num[begin]; 
            }
            
            int mid = (end - begin) / 2 + begin;
            
            if(num[mid] < num[mid -1] && num[mid] < num[mid+1]){
                return num[mid];
            }
            
            if(num[mid] > num[begin]){
                begin = mid;
            }else{
                end = mid;
            }
        
        }
        
        return num[begin];
    }
}
