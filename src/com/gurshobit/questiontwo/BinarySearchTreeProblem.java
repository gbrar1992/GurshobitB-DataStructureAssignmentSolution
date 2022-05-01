package com.gurshobit.questiontwo;

public class BinarySearchTreeProblem {
    public static Node treeNode;
    public static Node previousNode, rootNode = null;

    public static void convertTree(Node parentNode){
        if(parentNode == null){
            return;
        }

        convertTree(parentNode.left);

        Node rightNode = parentNode.right;

        if(rootNode == null){
            rootNode = parentNode;
        } else {
            previousNode.right = parentNode;
        }
        parentNode.left = null;
        previousNode = parentNode;

        convertTree(rightNode);

    }

    public static void traverseTree(Node parentNode){
        if(parentNode ==  null){
            return;
        }

        System.out.print(parentNode.data + " ");
        traverseTree(parentNode.right);
    }

    public static void main(String[] args) {
        treeNode = new Node(50);
        treeNode.left = new Node(30);
        treeNode.right = new Node(60);
        treeNode.left.left = new Node(10);
        treeNode.right.left = new Node(55);

        convertTree(treeNode);
        traverseTree(rootNode);
    }
}
