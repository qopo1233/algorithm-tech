package com.magnus.algorithm;

/**
 * @ClassName BinaryTreeNode
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/28 10:01
 */
public class BinaryTreeNode {

    public int value;

    public BinaryTreeNode left;

    public BinaryTreeNode right;

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(int value) {
        this.value = value;
    }
}
