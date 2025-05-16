package leetcode;

public class ClosestBinarySearchTreeValue {
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        while (root != null) {
            if (Math.abs(target - root.val) < Math.abs(target - closest)) {
                closest = root.val;
            } else if (Math.abs(target - root.val) == Math.abs(target - closest)) {
                closest = Math.min(closest, root.val);
            }
            root = root.val > target ? root.left : root.right;
        }

        return closest;
    }
}
