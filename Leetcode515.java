import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Leetcode515 {
    public List<Integer> largestValues(TreeNode root) 
    {
        List<Integer> ans= new ArrayList<>();
        largest(root , ans , 0);
        
        return ans;
        
    }
    
    private void largest(TreeNode currentnode , List<Integer> ans , int level)
    {
        if(currentnode == null)
            return;
        
        // if(level==ans.size())
            // ans.add(currentnode.val);
        // else
            // ans.set(level , Math.max(ans.get(level) , currentnode.val));
        
        // largest(currentnode.left , ans , level+1);
        // largest(currentnode.right , ans , level+1);
        
    }
}
