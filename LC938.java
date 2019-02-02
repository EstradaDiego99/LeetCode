public class LC938{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public int rangeSumBST(TreeNode root, int L, int R) {
        int suma = 0;
        suma = (root.val>=L && root.val<=R ? suma+root.val : suma);
        if(root.left!=null){
            suma += rangeSumBST(root.left, L, R);
        }
        if(root.right!=null){
            suma += rangeSumBST(root.right, L, R);
        }
        return suma;
    }
    
}