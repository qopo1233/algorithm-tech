package com.magnus.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Node
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/15 17:25
 */
public class Node {

    public int val;

    public List<Node> children;

    public Node() {

    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    public void addChild(Node node) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(node);
    }

}
