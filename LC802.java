public class LC802{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int heightPlus = 0;
        int[] mayorVertical = new int[grid.length];
        int[] mayorHorizontal = new int[grid[0].length];
        // Busquemos al maximo
        for(int i=0; i<grid[0].length; i++){
            for(int j=0; j<grid.length; j++){
                mayorHorizontal[i] = (grid[j][i]>mayorHorizontal[i] ? grid[j][i] : mayorHorizontal[i]);
            }
            // System.out.println(mayorHorizontal[i]);
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                mayorVertical[i] = (grid[i][j]>mayorVertical[i] ? grid[i][j] : mayorVertical[i]);
            }
            // System.out.println(mayorVertical[i]);
        }
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                heightPlus += Math.min(mayorVertical[i], mayorHorizontal[j]) - grid[i][j];
            }
        }
        return heightPlus;
    }
    
}