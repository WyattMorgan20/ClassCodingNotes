/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inclasstrees2;

/**
 *
 * @author s540549
 */
public class InClassTrees2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TreeNode root = null;
        root = add(root, 12);
        add(root, 23);
        add(root, 34);
        add(root, 11);
        add(root, 21);
        add(root, 24);
        add(root, 32);
        add(root, 15);
        add(root, 26);
        add(root, 29);
        
        inOrder(root);
        
    }
    
    public static TreeNode add(TreeNode root, int key){
        if(root == null){
            return new TreeNode(key);
        }
        
        if(key < root.val){
            root.leftlink = add(root.leftlink, key);
        }
        else{
            root.rightlink = add(root.rightlink, key);
        }
        
        return root;
    }
    
    public static void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        
        inOrder(root.leftlink);
        System.out.print(root.val + " ");
        inOrder(root.rightlink);
    }
    
}
