// Diego Estrada Talamantes
// devdiegoest@gmail.com

public class LC983{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public int mincostTickets(int[] days, int[] costs) {
        int[]  upToSuma = new int[days.length];
        upToSuma[0] = days[0];
        for(int i=1; i<upToSuma.length; i++){
            upToSuma[i] = upToSuma[i-1] + days[i];
        }
    }
    
}