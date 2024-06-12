package stackIntro;

import java.util.Stack;

public class ValidateParantheses {

    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Every close bracket has a corresponding open bracket of the same type.

     */

    public static void main(String[] args) {
        String str = "()[]{}";
        System.out.println(isValid(str));

    }

    public static boolean isValid(String str) {

        if (null == str || ((str.length() % 2) != 0)) { // if String is empty or length is not
            return false;                                //  divisible by 2 returns false. no need to go forward
        }

        char[] split = str.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < split.length; i++) {
            if(split[i] == '(' || split[i] == '{' ||  split[i] == '['){
                stack.push(split[i]);
            } else if (split[i] == ')' && !stack.isEmpty() && stack.peek()=='(') {
                stack.pop();
            }else if (split[i] == '}' && !stack.isEmpty() && stack.peek()=='{') {
                stack.pop();
            }else if (split[i] == ']' && !stack.isEmpty() && stack.peek()=='[') {
                stack.pop();
            }else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
