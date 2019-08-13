// My Code 


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> result =  new ArrayList<>();
        Stack<TreeNode> s = new Stack<TreeNode>();
        s.add(root);
        while(root!=null && !s.isEmpty()){
            while(root.right!=null){
                s.add(root.right);
                root = root.right;
            }
            result.add(s.pop().val);
            if(s.isEmpty()) break;
            root = s.pop();
            result.add(root.val);
            if(root.left!=null){
                root =root.left;
                s.add(root);
            }
        }
        return result;
    }
}


// class Solution {
// public:
//     vector<int> inorderTraversal(TreeNode* root) {
//         vector<int> result;
//         if(root == NULL) {
//             return result;
//         }
//         stack<TreeNode*> st;
//         while(1) {
//             while(root) {
//                 st.push(root);
//                 root = root->right;
//             }
//             TreeNode* temp = st.top();
//             st.pop();
//             result.push_back(temp->val);
//             root = temp->left;  
//             if(st.empty() &&!root) {
//                 break;
//             }
//         }
//         return result;
//     }
// };
