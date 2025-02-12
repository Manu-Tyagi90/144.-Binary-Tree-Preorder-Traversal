class TreeNode {
int data;
TreeNode l;
TreeNode r;
TreeNode(int x, TreeNode y, TreeNode z) {
data = x;
l = y;
r =z;  
}
}

public class RecursiveSolution{
public static List<Integer> preOrder(TreeNode root) {
List<Integer> res = new ArrayList<>();
if(root!=null){
res.add(root.data);
res.addAll(preOrder(root.l));
res.addAll(preOrder(root.r));

}
return res;
}}
