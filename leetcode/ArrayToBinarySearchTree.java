package leetcode;

public class ArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length - 1);
    }

    private TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if (left > right) return null;
        int midpoint = left + (right - left) / 2;
        TreeNode leftTreeNode = constructTreeFromArray(nums, left, midpoint - 1);
        TreeNode rightTreeNode = constructTreeFromArray(nums, midpoint + 1, right);

        return new TreeNode(nums[midpoint], leftTreeNode, rightTreeNode);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
