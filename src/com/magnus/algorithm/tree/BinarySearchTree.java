package com.magnus.algorithm.tree;

import com.magnus.algorithm.BinaryTreeNode;

/**
 * @ClassName BinarySearchTress
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/31 14:06
 */
public class BinarySearchTree {

    private BinaryTreeNode tree;

    /**
     * 二叉搜索树查找
     * @param data
     * @return
     */
    public BinaryTreeNode find(int data) {
        if (tree == null) {
            return null;
        }
        BinaryTreeNode p = tree;
        while (p != null) {
            if (p.value == data) {
                return p;
            }
            if (p.value > data) {
                p = p.left;
            }else {
                p = p.right;
            }
        }
        return null;
    }


    /**
     * 插入节点
     * @param data
     */
    public void insert(int data) {
        if (tree == null) {
            tree = new BinaryTreeNode(data);
            return;
        }
        BinaryTreeNode p = tree;
        while (p != null) {
            if (p.value > data) {
                if (p.left == null) {
                    p.left = new BinaryTreeNode(data);
                    return;
                }
                p = p.left;
            }else {
                if (p.right == null) {
                    p.right = new BinaryTreeNode(data);
                    return;
                }
                p = p.right;
            }
        }
    }

    /**
     * 删除节点
     * @param data
     */
    public void delete(int data) {
        BinaryTreeNode p = tree;
        BinaryTreeNode pp = null;
        while (p != null && p.value != data) {
            pp = p;
            if (p.value > data) {
                p = p.left;
            }else {
                p = p.right;
            }
        }
        // 未找到节点
        if (p == null) {
            return;
        }
        if (p.left != null && p.right != null) {
            // 查找右子树的最小节点
            BinaryTreeNode miniP = p.right;
            BinaryTreeNode miniPP = p;
            while (miniP.left != null) {
                miniPP = miniP;
                miniP = miniP.left;
            }
            // 把最小的节点的值这是到要删除的节点上
            p.value = miniP.value;
            p = miniP;
            pp = miniPP;
        }
        BinaryTreeNode child;
        if (p.left != null) {
            child = p.left;
        }else if (p.right != null) {
            child = p.right;
        }else {
            child = null;
        }
        if (pp == null) {
            tree = child;
            return;
        }
        if (pp.left == p) {
            pp.left = child;
        }else {
            pp.right = child;
        }



    }
}
