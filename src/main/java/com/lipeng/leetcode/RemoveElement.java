package com.lipeng.leetcode;

public class RemoveElement {
    public int removeElement(int[] A, int elem) {
        if(A == null || A.length == 0){
            return 0;
        }
        
        int i = 0;
        int j = A.length;
        
        while(i < j){
            if(A[i] == elem){
                A[i] = A[j-1];
                j--;
            }else{
                i++;
            }
        }
        
        return j;
    }
}
