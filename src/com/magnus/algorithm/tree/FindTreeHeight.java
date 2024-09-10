package com.magnus.algorithm.tree;

import com.magnus.algorithm.BinaryTreeNode;

/**
 * @ClassName FindTreeHeight
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/9/1 16:08
 */
public class FindTreeHeight {


    public static void main(String[] args) {
        FindTreeHeight findTreeHeight = new FindTreeHeight();

//        findTreeHeight.getTreeHeight()
    }

    /**
     * 查询树的高度-只有根节点的二叉树的高度为 1，而没有叶子节点的高度为 0
     * @param tree
     * @return
     */
    public int getTreeHeight(BinaryTreeNode tree) {
        if (tree == null) {
            return 0;
        }
        int leftHeight = getTreeHeight(tree.left);
        int rightHeight = getTreeHeight(tree.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
