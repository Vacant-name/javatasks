package leetCode.N94_BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    List<Integer> list = new ArrayList<>();
    TreeNode treeNode;
    public List<Integer> inorderTraversal(TreeNode root) {
        treeNode = root;
        System.out.println(root.left.val);
        System.out.println(root.right.val);

        return list;
    }
}
