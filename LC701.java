public class LC701{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(val<root.val){
            if (root.left!=null){
                insertIntoBST(root.left,val);
            } else {
                root.left = new TreeNode(val);
            }
        } else {
            if (root.right!=null){
                insertIntoBST(root.right,val);
            } else {
                root.right = new TreeNode(val);
            }
        }
        return root;
    }
    
}