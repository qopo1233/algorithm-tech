package com.magnus.algorithm.tree;

import com.magnus.algorithm.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @ClassName BinaryTreeOrder
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/28 10:00
 */
public class BinaryTreeOrder {

    public static void main(String[] args) {
        BinaryTreeNode rootBinaryTreeNode = new BinaryTreeNode(1, new BinaryTreeNode(2), new BinaryTreeNode(3));
        List<Integer> values = new ArrayList<>();
        preOrder(rootBinaryTreeNode, values);
        List<Integer> values1 = new ArrayList<>();
        middleOrder(rootBinaryTreeNode, values1);
        List<Integer> values2 = new ArrayList<>();
        postOrder(rootBinaryTreeNode, values2);
        System.out.println("前序遍历" + values.stream().map(Object::toString).collect(Collectors.joining(",")));
        System.out.println("中序遍历" + values1.stream().map(Object::toString).collect(Collectors.joining(",")));
        System.out.println("后序遍历" + values2.stream().map(Object::toString).collect(Collectors.joining(",")));
    }

    public static void preOrder(BinaryTreeNode binaryTreeNode, List<Integer> values) {
        if (Objects.isNull(binaryTreeNode)) {
            return;
        }
        values.add(binaryTreeNode.value);
        preOrder(binaryTreeNode.left, values);
        preOrder(binaryTreeNode.right,values);
    }

    public static void middleOrder(BinaryTreeNode binaryTreeNode, List<Integer> values) {
        if (Objects.isNull(binaryTreeNode)) {
            return;
        }
        middleOrder(binaryTreeNode.left, values);
        values.add(binaryTreeNode.value);
        middleOrder(binaryTreeNode.right, values);
    }

    public static void postOrder(BinaryTreeNode binaryTreeNode, List<Integer> values) {
        if (Objects.isNull(binaryTreeNode)) {
            return;
        }
        postOrder(binaryTreeNode.left, values);
        postOrder(binaryTreeNode.right, values);
        values.add(binaryTreeNode.value);
    }
}
