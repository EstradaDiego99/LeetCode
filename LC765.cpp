#include <vector>
#include <stack>
#include <iostream>
using namespace std;

class Solution {
public:
    int minSwapsCouples(vector<int>& row) {
        vector<int> posiciones (row.size());
        for(int i=0; i<row.size(); i++){
            posiciones[row[i]] = i;
        }
        int contador = 0;

        for(int i=0; i<row.size(); i+=2){

            int pareja;
            if(row[i]%2==0){
                pareja = row[i]+1;
            } else {
                pareja = row[i]-1;
            }

            if(row[i+1]!=pareja){
                int aux = row[i];
                if(posiciones[pareja]%2==0){
                    row[i] = row[posiciones[pareja]+1];
                    row[posiciones[pareja]+1] = aux;
                } else {
                    row[i] = row[posiciones[pareja]-1];
                    row[posiciones[pareja]-1] = aux;
                }
                contador++;
                i-=2;
            }
        }

        return contador;
    }
};