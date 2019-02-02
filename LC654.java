// Diego Estrada Talamantes
// devdiegoest@gmail.com

public class LC654{

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        System.out.println();
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000000;
        System.out.println("Tiempo: "+totalTime+" ms");
    }

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return constructMaximumBinaryTree(nums, 0, nums.length-1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if(start==end)
            return new TreeNode(nums[start]);
        if(start>end || end<start){
            return null;
        }
        int index = start;
        int max = nums[start];
        for(int i=start; i<=end; i++){
            if(nums[i]>=max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode root = new TreeNode(max);
        root.left = constructMaximumBinaryTree(nums, start, index-1);
        root.right = constructMaximumBinaryTree(nums, index+1, end);
        return root;
    }
    
}