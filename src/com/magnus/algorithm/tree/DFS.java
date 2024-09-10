package com.magnus.algorithm.tree;

import com.magnus.algorithm.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName DFS
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/15 19:18
 */
public class DFS {


    public static void main(String[] args) {

        List<Integer> nodeValueList = new ArrayList<>();
        Node root = new Node(1);
        Node node1 = new Node(2);
        node1.addChild(new Node(3));
        node1.addChild(new Node(4));
        root.addChild(node1);
        root.addChild(new Node(5));

        dfs(root, nodeValueList);

        nodeValueList.stream().forEach(integer -> {
            System.out.println(integer.toString());
        });
    }

    public static void dfs(Node root, List<Integer> nodeValueList) {
        if (root == null) {
            return;
        }
        nodeValueList.add(root.val);
        List<Node> children = root.children;
        if (children == null || children.isEmpty()) {
            return;
        }
        for (Node child : children) {
            dfs(child, nodeValueList);
        }

    }
}
