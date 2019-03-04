// Diego Estrada Talamantes
// devdiegoest@gmail.com

#include <TreeNode.h>
#include <iostream>
using namespace std;

class Solution {
public:
    TreeNode* pruneTree(TreeNode* root) {
        if(root->left!=NULL){
            root->left = pruneTree(root->left);
        }
        if(root->right!=NULL){
            root->right = pruneTree(root->right);
        }
        if(root->left==NULL && root->right==NULL){
            if(root->val!=1){
                return NULL;
            }
        }
        return root;
    }
};