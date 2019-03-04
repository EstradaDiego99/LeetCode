// Diego Estrada Talamantes
// devdiegoest@gmail.com

#include <iostream>
#include <vector>
#include <unordered_map>
#include <unordered_set>
using namespace std;

class Solution {
public:
    vector<string> findAndReplacePattern(vector<string>& words, string pattern) {
        vector<string> output;
        for(int i=0; i<words.size(); i++){
            bool toAdd = true;
            unordered_map<char,char> mapa;
            unordered_set<char> tomados;
            for(int j=0; j<pattern.size(); j++){
                if(mapa.find(pattern.at(j)) == mapa.end()){
                    if(tomados.find(words[i].at(j))==tomados.end()){
                        mapa[pattern.at(j)] = words[i].at(j);
                        tomados.insert(words[i].at(j));
                    } else {
                        toAdd = false;
                        break;
                    }
                } else if(mapa[pattern.at(j)] != words[i].at(j)){
                    toAdd = false;
                    break;
                } 
            }
            if(toAdd){
                output.push_back(words[i]);
            }
        }
        return output;
    }
};