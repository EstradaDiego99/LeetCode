// Diego Estrada Talamantes
// devdiegoest@gmail.com

#include <iostream>
#include <algorithm>
#include <unordered_set>
using namespace std;

class Solution {
public:
    bool buddyStrings(string A, string B) {
        int diff = 0;
        int difA, difB;
        bool second = false;
        for(int i=0; i<std::min(A.size(),B.size()); i++){
            if(A.at(i)!=B.at(i)){
                diff++;
                if(!second){
                    difA = i;
                    second = true;
                } else {
                    difB = i;
                }
            }
        }
        if(diff==2){
            return A.at(difA)==B.at(difB) && A.at(difB)==B.at(difA);
        } else if(diff==0){
            unordered_set<char> aRepetir;
            for(int i=0; i<std::min(A.size(),B.size()); i++){
                if(aRepetir.find(A.at(i))==aRepetir.end()){
                    aRepetir.insert(A.at(i));
                } else {
                    return true;
                }
            }
            return false;
        } else{
            return false;
        }
    }
};