package ru.vsu.garaba;

public class SimpleLinkedListStack <T> implements SimpleStack<T> {

    private class ListNode<T> {
        public T value;
        public ListNode<T> next;

        public ListNode(T value, ListNode<T> next) {
            this.value = value;
            this.next = next;
        }
    }

    private ListNode<T> head = null;

    private int count = 0;

    @Override
    public void push(T value) {
        head = new ListNode<>(value, head);
        count++;
    }

    @Override
    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        T value = head.value;
        head = head.next;
        count--;
        return value;
    }

    @Override
    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return head.value;
    }

    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    public int search (T object) throws Exception{
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        ListNode curr = head;
        for (int i = 0; i < count; i++) {

            if (curr.value.equals(object))
                return i;
            curr = curr.next;

        } return -1;

    }

    public void solution() throws Exception {
        SimpleLinkedListStack<T> secondStack = new SimpleLinkedListStack<>();
        while (!this.isEmpty())
            secondStack.push(this.pop());

        SimpleLinkedListStack<T> thirdStack = new SimpleLinkedListStack<>();
        while (!secondStack.isEmpty())
            thirdStack.push(secondStack.pop());

        while (!thirdStack.isEmpty())
            this.push(thirdStack.pop());


    }
}
