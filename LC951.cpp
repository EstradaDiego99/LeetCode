// Diego Estrada Talamantes
// devdiegoest@gmail.com

#include <iostream>
using namespace std;
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};
class Solution {
public:
    bool flipEquiv(TreeNode* root1, TreeNode* root2) {

        if(root1==NULL && root2==NULL){
            return true;
        }
        if(root1==NULL || root2==NULL){
            return false;
        }

        int r1Left, r1Right, r2Left, r2Right;
        if(root1->left==NULL){
            r1Left = 0;
        } else {
            r1Left = root1->left->val;
        }
        if(root1->right==NULL){
            r1Right = 0;
        } else {
            r1Right = root1->right->val;
        }
        if(root2->left==NULL){
            r2Left = 0;
        } else {
            r2Left = root2->left->val;
        }
        if(root2->right==NULL){
            r2Right = 0;
        } else {
            r2Right = root2->right->val;
        }

        if(r1Left==r2Left && r1Right==r2Right){
            return flipEquiv(root1->left,root2->left) &&
            flipEquiv(root1->right,root2->right);
        } else if(r1Left==r2Right && r1Right==r2Left){
            return flipEquiv(root1->left,root2->right) && 
            flipEquiv(root1->right,root2->left);
        }

        return false;
    }
};