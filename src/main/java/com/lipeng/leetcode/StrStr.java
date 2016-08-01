package com.lipeng.leetcode;


public class StrStr {
    public String strStr(String haystack, String needle) {
        if(haystack == null || needle == null){
            return null;
        }
        
        if(haystack.isEmpty()&&needle.isEmpty()){
            return "";
        }
        
        if(needle.isEmpty()){
            return haystack;
        }
        
        int lenHaystack = haystack.length();
        int lenNeedle = needle.length();
        if(lenHaystack < lenNeedle){
            return null;
        }
        
        int ret = 0;
        while(ret < lenHaystack - lenNeedle+1){
            int i = 0;
            for(int j=ret; i<lenNeedle; i++,j++){
                if(haystack.charAt(j) == needle.charAt(i)){
                    continue;
                }else{
                    break;
                }
            }
            if(i == lenNeedle){
                return haystack.substring(ret);
            }
            ret++;
        }
        
        return null;
        
    }
}
