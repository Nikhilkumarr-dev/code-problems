import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;
public class TopView {
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
        }
        Node root = new Node(preorder[idx]);
        root.left=buildTree(preorder);
        root.right=buildTree(preorder);
        return root;

    }
    static class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
    static void TopView(Node root){
        Queue<Pair>  q =new LinkedList<>();
        Map<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));

        while(q.size()>0){
            Pair curr = q.poll();
            Node currNode =  curr.node;
            int currHd = curr.hd;
            if(!map.containsKey(currHd)){
                map.put(currHd,currNode.data);
            }
            if(currNode.left!=null){
                q.add(new Pair(currNode.left,currHd-1));
            }
            if(currNode.right!=null){
                q.add(new Pair(currNode.right,currHd+1));
            }
        }
        System.out.println(map.values());
    }
    static void KthValue(Node root,int k){
        if(root==null){
            return;
        }
        if(k==1){
            System.out.println(root.data);
            return;
        }
        KthValue(root.left, k-1);
        KthValue(root.right, k-1);
    }
    public static void main(String [] args){
        int [] preorder = {1,2,7,-1,-1,-1,3,4,-1,-1,5,-1,-1};
        Node root = buildTree(preorder);
        TopView(root);
        KthValue(root,1);
    }
}
