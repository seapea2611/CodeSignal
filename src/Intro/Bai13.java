package Intro;

import java.util.Stack;

public class Bai13 {
    String solution(String inputString) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : inputString.toCharArray())
        {
            if(c == '(') {
                stack.push(sb.toString());
                sb = new StringBuilder();
            }
            else if( c == ')') {
                String s = sb.toString();
                sb = new StringBuilder(stack.pop());
                sb.append(new StringBuilder(s).reverse().toString());

            }
            else {
                sb.append(c);
            }
        }
        //   while(!stack.isEmpty()) {
        //       sb.insert(0, stack.pop());
        //   }

        return sb.toString();

    }

}
