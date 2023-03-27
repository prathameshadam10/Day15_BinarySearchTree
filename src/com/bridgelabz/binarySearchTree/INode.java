package com.bridgelabz.binarySearchTree;

public class INode<T extends Comparable<T>> {
    T data;
    INode<T> nextRN;
    INode<T> nextLN;

    public INode(T data) {
        this.data = data;
    }
}
