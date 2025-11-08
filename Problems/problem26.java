public class problem26{

    static class TreeNode{   
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val=val;
        }
    }
    //root1
    public static boolean isValidBST(TreeNode root){
        return isValidBSTHelper(root ,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    //8,3,10-->3,1,6-->1
    public static boolean isValidBSTHelper(TreeNode node,long min,long max){
        //8
        if(node==null){
            return true;
        }
        //node.val--.1-nukll,null
        if(node.val<=min || node.val>=max){ //false
            return false;
        }

        //lefISValid-->3
        boolean leftIsValid=isValidBSTHelper(node.left, min,node.val);
        if(!leftIsValid){
            return false;
        }
        boolean rightIsValid = isValidBSTHelper(node.right, node.val, max);
        return rightIsValid;
    }
    
    public static void main(String []args){
        //          8
        //         / \
        //        3   10
        //       /\    \
        //      1  6    14
        TreeNode root1 = new TreeNode(8);
        root1.left=new TreeNode(3);
        root1.right=new TreeNode(10);
        root1.left.left=new TreeNode(1);
        root1.left.right=new TreeNode(6);
        root1.right.right=new TreeNode(14);
        System.out.println(root1);
        System.out.println("Tree  is bst"+isValidBST(root1));
    }
}