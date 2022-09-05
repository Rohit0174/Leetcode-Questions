/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result=new ArrayList<>();
        if(root==null)
            return result;
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        List<Integer> list=new ArrayList<>();
        while(queue.size()!=1){
            Node node=queue.poll();
            if(node!=null){
                list.add(node.val);
               List<Node> temp=node.children;
                for(int i=0;i<temp.size();i++)
                    queue.add(temp.get(i));
            }else{
                queue.add(null);
                result.add(list);
                list=new ArrayList<>();
            }
            
        }
        result.add(list);
        return result;
    }
}