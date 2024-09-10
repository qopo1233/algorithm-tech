package com.magnus.algorithm.tree;

import com.magnus.algorithm.Node;
import com.magnus.algorithm.sort.InsertSort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @ClassName LevelOrder
 * @Description TODO
 * @Author yangchuanhua1
 * @Date 2024/8/15 17:27
 */
public class LevelOrder {


    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }

        Queue<Node> queue = new ArrayDeque<Node>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < cnt; i++) {
                Node poll = queue.poll();
                level.add(poll.val);
                List<Node> children = poll.children;
                for (Node child : children) {
                    queue.offer(child);
                }
            }
            lists.add(level);
        }

        return lists;
    }
}
