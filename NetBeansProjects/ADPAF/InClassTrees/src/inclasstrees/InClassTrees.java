/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasstrees;


/**
 *
 * @author s540549
 */
public class InClassTrees {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeNode root = new TreeNode(23);
        TreeNode left = new TreeNode(22);
        TreeNode right = new TreeNode(27);
        TreeNode leftLeft = new TreeNode(18);
        TreeNode leftRight = new TreeNode(22);
        TreeNode rightLeft = new TreeNode(26);
        TreeNode rightRight = new TreeNode(29);
        TreeNode leftLeftLeft = new TreeNode(16);
        
        // linking the root and subtrees
        root.leftLink = left;
        root.rightLink = right;
        
        left.leftLink = leftLeft;
        left.rightLink = leftRight;
        
        right.leftLink = rightLeft;
        right.rightLink = rightRight;
        
        leftLeft.leftLink = leftLeftLeft;
        
        inOrder(root);
    }
    
    // inOrder is left -> root -> right
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        inOrder(root.leftLink);
        System.out.print(root.val + " ");
        inOrder(root.rightLink);
    }
    
}
