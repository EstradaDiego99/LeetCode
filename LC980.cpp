#include <vector>
#include <stack>
#include <iostream>
using namespace std;

class Solution {
public:
    int uniquePathsIII(vector<vector<int>>& grid) {
        stack<int> xCamino;
        stack<int> yCamino;
        int xCoord, yCoord;
        for(int i=0; i<grid.size(); i++){
            for(int j=0; j<grid[0].size(); j++){
                if(grid[i][j]==1){
                    xCamino = i;
                    yCamino = j;
                    break;
                }
            }
        }
        int recorridos = 1;
    }
};