package ru.vsu.garaba;

import java.util.Stack;

public class Main {

    public static void main(String[] args) throws Exception {
        SimpleLinkedListStack<String> stack1 = new SimpleLinkedListStack<>();
        stack1.push("1");
        stack1.push("2");
        stack1.push("3");
        stack1.push("4");
        stack1.push("5");
        stack1.push("6");

        SimpleLinkedListStack<String> stack2 = new SimpleLinkedListStack<>();
        stack2.push("1");
        stack2.push("2");
        stack2.push("3");
        stack2.push("4");
        stack2.push("5");
        stack2.push("6");

        stack1.solution();

        while (!stack1.isEmpty())
            System.out.println(stack1.pop());
        System.out.println("-----------------------------");
        while (!stack2.isEmpty())
            System.out.println(stack2.pop());
        System.out.println("-----------------------------");


    }

}