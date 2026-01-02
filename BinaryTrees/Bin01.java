
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Bin01 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int val){
            this.data=val;
            this.left=null;
            this.right=null;
        }
        
    }
        static int idx=-1;
        static Node buildTree(int[] preorder){
            idx++;  
            if(preorder[idx]==-1){
                return null;
            }
            Node root = new Node(preorder[idx]);
            root.left=buildTree(preorder);
            root.right=buildTree(preorder);
            return root;
        }
        //root,left,right
        static void preorderPrint(Node root){
            if(root==null) return;

            System.out.print(root.data+ " ");
            preorderPrint(root.left);
            preorderPrint(root.right);
        }
        //left,root,right
        static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data);
            inorder(root.right);
        }
        //left,right,root
        static void PostOrder(Node root){
            if(root==null){
                return;
            }
            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data);
        }


        static void LevelOrderTraversal(Node root){
            Queue<Node> q= new LinkedList<>();
            q.add(root);

            while(q.size()>0){
                Node curr = q.peek();
                q.poll();
                System.out.print(curr.data);

                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }

            }
            System.out.println("");
        }
        static void LevelOrder1(Node root){
            Queue<Node> q1 = new ArrayDeque<>();
            q1.add(root);
            q1.add(null);   

            while(q1.size() > 0){
                Node curr1 = q1.peek();
                q1.poll();

             if(curr1 == null){
                if(!q1.isEmpty()){
                System.out.println("");
                q1.add(null);
                continue;
                }else{
                    break;
                }   
            }

        System.out.println(curr1.data);

        if(curr1.left != null){
            q1.add(curr1.left);
        }
        if(curr1.right != null){
            q1.add(curr1.right);
        }
    }
}

    public static void main(String[] args){
        int[] preorder={1,2,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        preorderPrint(root);
        System.out.println("");
        inorder(root);
        System.out.println("");
        PostOrder(root);
        System.out.println("");
        LevelOrderTraversal(root);
        System.out.println("");
        LevelOrder1(root);
    }

}
