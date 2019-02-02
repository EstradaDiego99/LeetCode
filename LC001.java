import java.util.HashMap;

public class LC001 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // Aquí escribimos el método respuesta
        int[] input = {2, 7, 11, 15};
        int[] output = twoSum(input,22);
        System.out.print(output[0]+" ");
        System.out.println(output[1]);
        long endTime   = System.nanoTime();
        long totalTime = (endTime - startTime) / 1000;
        System.out.println("Tiempo: "+totalTime+" micros");
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        HashMap<Integer,Integer> complementos = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(complementos.containsKey(target - nums[i])){
                output[0] = complementos.get(target - nums[i]);
                output[1] = i;
                break;
            } else{
                complementos.put(nums[i],i);
            }
        }
        return output;
    }
    
}