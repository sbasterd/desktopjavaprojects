package com.deitel.datastructures;

class ListNode<T> {
    T data;
    ListNode<T> nextNode;

    ListNode(T object, ListNode<T> node) {
        data = object;
        nextNode = node;
    }

    ListNode(T object) {
        this(object, null);
    }

    T getData() {
        return data;
    }

    ListNode<T> getNextNode() {
        return nextNode;
    }

}

public class List<T> {
    private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private String name;

    public List(String listName) {
        name = listName;
        firstNode = lastNode = null;
    }

    public List() {
        this("list");
    }

    public void insertAtFront(T insertItem) {
        if (isEmpty()) {
            firstNode = lastNode = new ListNode<T>(insertItem);
        } else {
            firstNode = new ListNode<T>(insertItem, firstNode);
        }
    }

    public void insertAtBack(T insertItem) {
        if (isEmpty())
            firstNode = lastNode = new ListNode<T>(insertItem);
        else
            lastNode = lastNode.nextNode = new ListNode<T>(insertItem);
    }

    public T removeFromFront() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);
        T removedItem = firstNode.data;

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else
            firstNode = firstNode.nextNode;

        return removedItem;

    }

    public T removeFromBack() throws EmptyListException {
        if (isEmpty())
            throw new EmptyListException(name);
        T removedItem = lastNode.data;

        if (firstNode == lastNode)
            firstNode = lastNode = null;
        else {
            ListNode<T> current = firstNode;

            while (current.nextNode != lastNode) {
                current = current.nextNode;

            }
            lastNode = current;
            current.nextNode = null;
        }
        return removedItem;
    }

    public boolean isEmpty() {
        return firstNode == null;
    }

    public void print() {
        if (isEmpty()) {
            System.out.printf("Empty %s%n", name);
            return;
        }
        System.out.printf("The %s is: ", name);
        ListNode<T> current = firstNode;
        while (current != null) {
            System.out.printf("%s ", current.data);
            current = current.nextNode;

        }
        System.out.println();
    }

}
