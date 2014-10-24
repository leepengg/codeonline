package com.lipeng.leetcode;

import java.util.Stack;

public class ValidParentheses {

    static int[] map;
    static{
        map = new int[255];
        map['('] = 0;
        map[')'] = 1;
        map['{'] = 10;
        map['}'] = 11;
        map['['] = 20;
        map[']'] = 21;
        
    }
    
    public boolean isValid(String s) {
        if(s == null || s.length() == 1){
            return false;
        }
        
        if(s.isEmpty()){
            return true;
        }
        
        Stack<Character> stack = new Stack<Character>();
        
        int i = 0 ;
        int len = s.length();
        
        while(i < len){
            if(stack.empty()){
                stack.push(s.charAt(i));
            }else{
                char top = stack.peek();
                if(Math.abs(map[top] - map[s.charAt(i)]) == 1){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }
            }
            i++;
        }
        
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
        
    }
    
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParentheses vp = new ValidParentheses();
		
		System.out.println(vp.isValid("[["));

	}

}
