package com.lipeng.leetcode;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] A) {
        if(A == null || A.length == 0){
            return 0;
        }
        if(A.length == 1){
            return 1;
        }
        if(A.length == 2){
            if(A[0] == A[1]){
                return 1;
            }
            return 2;
        }

        int len = A.length;
        int ret = A.length;
        int i = 0;
        int j = 1;

        while(j < len){
            if(A[i] == A[j]){
                A[i] = A[j++];
            }else{
                if((j - i) > 1){
                    A[i+1] = A[j];
                }
                i++;
                j++;
            }
        }

        return i+1;

    }
}
