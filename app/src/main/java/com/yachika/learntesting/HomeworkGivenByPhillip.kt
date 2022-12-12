package com.yachika.learntesting

import java.util.Stack

object HomeworkGivenByPhillip {

    /**
     * Checks if braces are set correctly
     *
     * e.g."(a*b)" should return false
     */
    fun checkBraces(string: String): Boolean {
        if (string.isEmpty()) {
            return false
        }
        val stack = Stack<Char>()
        for (i in string.toCharArray()) {
            if (i != '[' && i != ']' && i != '{' && i != '}' && i != '(' && i != ')')
                continue
            if (i == ']' && stack.isEmpty() || i == '}' && stack.isEmpty()|| i == ')' && stack.isEmpty())
                return false
            when(i){
                '{','[','('-> stack.push(i)
            }
            when(i){
                '}'->if(stack.peek()=='{') stack.pop() else return false
                ']'->if(stack.peek()=='[') stack.pop() else return false
                ')'->if(stack.peek()=='(') stack.pop() else return false
            }
        }
        return stack.isEmpty()
    }

}