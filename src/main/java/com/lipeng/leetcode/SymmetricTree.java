package com.lipeng.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SymmetricTree {
    private int depth = 0;

    private void trave(TreeNode root, Map<Integer, List<Integer>> result) {
        depth++;

        List<Integer> list = result.get(depth);
        if (list == null) {
            list = new ArrayList<Integer>();
            result.put(depth, list);
        }

        if (root == null) {
            list.add(1000000);
            depth--;
            return;
        }

        list.add(root.val);

        trave(root.left, result);
        trave(root.right, result);

        depth--;

    }

    public boolean isSymmetric(TreeNode root) {
        Map<Integer, List<Integer>> result = new HashMap<Integer, List<Integer>>();

        if (root == null || (root.left == null && root.right == null)) {
            return true;
        }

        trave(root, result);

        int size = result.size();

        for (int i = 1; i < size; i++) {
            List<Integer> line = result.get(i + 1);
            int lineSize = line.size();
            if (((lineSize % 2) == 0)) {
                for (int j = 0; j <= (lineSize / 2); j++) {
                    if (line.get(j).intValue() == line.get(lineSize - 1 - j).intValue()) {
                        continue;
                    } else {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] argv) {
        String[] arrays = { "1", "2", "2" };
        TreeNode root = TreeNode.create(arrays, 0);
        SymmetricTree st = new SymmetricTree();
        System.out.println(st.isSymmetric(root));
    }
}
