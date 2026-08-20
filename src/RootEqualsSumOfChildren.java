import javax.swing.tree.TreeNode;

void main() {
    class Solution {
        public boolean checkTree(TreeNode root) {

            return root.val==root.left.val+ root.right.val;


        }
    }
}