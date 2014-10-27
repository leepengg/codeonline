package com.lipeng.leetcode;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null){
            return null;
        }
        if(strs.length == 0){
            return "";
        }

        int i  = 0;
        StringBuffer sb = new StringBuffer();
        String tmp = strs[0];
        boolean flag = true;

        while(i < tmp.length() && flag == true){
            char c = tmp.charAt(i);

            for (String s : strs){
                if(i< s.length()){
                    char cc = s.charAt(i);
                    if(cc == c){
                         continue;
                    }else{
                        flag = false;
                     }
                }else{
                    flag = false;
                }

            }

            if(flag == true){
                i++;
            }
        }

        return tmp.substring(0, i);

    }
}
