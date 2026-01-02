public class Heght {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            this.data=val;
            this.left=left;
            this.right=right;
        }
    }
    static int idx=-1;
    static Node buildTree(int[] preorder){
            idx++;  
            if(preorder[idx]==-1){
                return null;
            }//{1,2,-1,-1,3,4,-1,-1,5,-1,-1};
            Node root = new Node(preorder[idx]);//1
            root.left=buildTree(preorder);//2//4//5
            root.right=buildTree(preorder);//3//
            return root;
    }
    static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight, rightHeight)+1;
    }
    static int count(Node root){
        if(root==null){
            return 0;
        }
        int leftCount=count(root.left);
        int rightCount=count(root.right);
        return leftCount+rightCount+1;
    }
    static int Sum(Node root){
        if(root==null){
            return 0;
        }
        int leftSum = Sum(root.left);
        int rightSum = Sum(root.right);
        return leftSum+rightSum+root.data;
    }
    public static void main(String []args){
        int arr[]={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(arr);
        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(Sum(root));
    }
}
