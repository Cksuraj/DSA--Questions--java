import java.util.*;
public class Threesum {

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; i < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> tsum = new ArrayList<Integer>();
                        tsum.add(nums[i]);
                        tsum.add(nums[j]);
                        tsum.add(nums[k]);
                        Collections.sort(tsum);
                        result.add(tsum);

                    }
                }
            }
        }
        result = new ArrayList<List<Integer>>(new LinkedHashSet<List<Integer>>(result));
        System.out.println(result);
    }
}
