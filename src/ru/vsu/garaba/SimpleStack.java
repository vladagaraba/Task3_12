package ru.vsu.garaba;

public interface SimpleStack<T> {
    void push(T value);
    T pop() throws Exception;
    T peek() throws Exception;

}
