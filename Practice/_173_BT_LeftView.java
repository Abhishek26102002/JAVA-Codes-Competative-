import java.util.ArrayList;

class Tree
{
    void solve(Node root,ArrayList<Integer> ans, int level){
        if(root==null){
            return;
        }
        if(level==ans.size()){
            ans.add(root.data);
        }
        solve(root.left,ans,level+1);  // left k lie right phele aaayega
        solve(root.right,ans,level+1);
    }
  
    ArrayList<Integer> letfView(Node root)
    {
        ArrayList<Integer> ans =new ArrayList<>();
         solve(root,ans,0);
      return ans;
    }
}
