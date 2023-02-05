package Seminar_4;

import java.util.*;

public class task_2 {

        public static boolean isBalanced(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(' || c == '[' || c == '{') { // [ {
                    stack.push(c);
                } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                    stack.pop();
                } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            }
            return stack.isEmpty();
        }

        public static void main(String[] args) {
            String s = "[{]}";
            System.out.println(isBalanced(s));
        }
    }
