class TreeNode {
int val;
TreeNode left;
TreeNode right;
TreeNode (int x, TreeNode y, TreeNode z) {
val = x;
left = y;
right = z;
} 
}

public class IterativeSolution{
public static List<Integer> preOrder(TreeNode root){
List<Integer> res = new ArrayList<>();
Stack<TreeNode> stack = new Stack<>();
stack.push(root);
while(!stack.isEmpty()) {
root = stack.pop();
res.add(root.val);

if(root.right !=null ){
stack.push(root.right);
}

if(root.left!=null) {
stack.push(root.left);
}
}
return res; 
}
}
