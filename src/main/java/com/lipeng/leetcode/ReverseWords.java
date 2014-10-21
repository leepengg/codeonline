package com.lipeng.leetcode;

import java.util.Stack;

public class ReverseWords {

    public String reverseWords(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder(s.length());

        char[] chars = s.toCharArray();
        int status = 0;
        for (char ch : chars) {
            switch (status) {
            case 0:
                if (ch == ' ') {
                    continue;
                } else {
                    status = 1;
                    stack.push(ch);
                }
                break;
            case 1:
                if (ch != ' ') {
                    stack.push(ch);
                } else {
                    status = 0;
                    while (!stack.empty()) {
                        Character c = stack.pop();
                        sb.append(c);
                    }
                    sb.append(' ');

                }
                break;
            }
        }

        if (!stack.empty()) {
            while (!stack.empty()) {
                Character c = stack.pop();
                sb.append(c);
            }
            sb.append(' ');
        }

        if (sb.length() == 0) {
            return "";
        }

        return sb.reverse().substring(1).toString();
    }

    public static void main(String[] args) {
        ReverseWords s = new ReverseWords();
        System.out.println(s.reverseWords("  the sky    is blue  "));

    }

}
