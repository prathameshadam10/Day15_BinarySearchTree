package com.bridgelabz.binarySearchTree;

public class BinarySearch<T extends Comparable<T>> {
    INode<T> root;

    public void add(T data) {
        INode<T> newNode = new INode<>(data);
        if(root == null){
            root = newNode;
            return;
        }
        INode<T> currentPointer = root;
        while (currentPointer.nextLN != null && currentPointer.nextRN != null){
            if(data.compareTo(currentPointer.data)<0){
                currentPointer = currentPointer.nextLN;
            }else {
                currentPointer = currentPointer.nextRN;
            }
        }
        if(data.compareTo(currentPointer.data)<0){
            currentPointer.nextLN = newNode;
        }else {
            currentPointer.nextRN = newNode;
        }
    }
}
