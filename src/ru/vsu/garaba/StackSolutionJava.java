package ru.vsu.garaba;

import java.util.Stack;

public class StackSolutionJava {
    public void solution2 (Stack stack) throws Exception {
        Stack secondStack = new Stack();
        while (!stack.empty())
            secondStack.push(stack.pop());

        Stack thirdStack = new Stack();
        while (!secondStack.empty())
            thirdStack.push(secondStack.pop());

        while (!thirdStack.isEmpty())
            stack.push(thirdStack.pop());

    }
}

