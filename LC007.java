// Diego Estrada Talamantes
// devdiegoest@gmail.com

public class LC007{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println(reverse(Integer.valueOf(args[0])));
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public static int reverse(int x) {
        char[] s = (""+x).toCharArray();
        long output = 0;
        for(int i=s.length-1; i>=1; i--){
            output = (output*10)+Character.getNumericValue(s[i]);
        }
        if(s[0]=='-'){
            output *= -1;
        } else{
            output = (output*10)+Character.getNumericValue(s[0]);
        }
        if(output>Integer.MAX_VALUE || output<Integer.MIN_VALUE){
            return 0;
        }

        return (int)output;
    }
    
}