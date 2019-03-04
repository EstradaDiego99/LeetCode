// Diego Estrada Talamantes
// devdiegoest@gmail.com

import java.util.HashSet;
public class LC771{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public int numJewelsInStones(String J, String S) {
        HashSet<Character> piedras = new HashSet<>();
        int c = 0;
        for(int i=0; i<J.length(); i++){
            piedras.add(J.charAt(i));
        }
        for(int i=0; i<S.length(); i++){
            if(piedras.contains(S.charAt(i))){
                c++;
            }
        }
        return c;
    }
    
}