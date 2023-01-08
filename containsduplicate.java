import java.util.*;
public class containsduplicate {
    public  static boolean Duplicate(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0; i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
                set.add(nums[i]);
   
                if(i>=k)
                    set.remove(nums[i-k]);
        }return false;
   }

   static int Reapet(int nums[]){
    HashSet<Integer>set=new HashSet<>();
    int arr=nums.length;
    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
        arr =nums[i];
        }
        else{
            set.add(nums[i]);
        }
    }return arr;
   }

   static boolean element(int nums[]){
    for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(nums[i]==nums[j]){
                return true;
            }

        }
    }
    return false;
   }

public static void main(String[] args) {
    int nums[]={1,2,3,4,3,4};
    int k=3;
   //System.out.println(Duplicate(nums, k));

   System.out.println(Reapet(nums));
   // System.out.print(element(nums));
}
}
