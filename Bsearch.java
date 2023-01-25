public class Bsearch {
    public static  boolean search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        // for(int i=0; i<nums.length;i++){
        //     if(nums[i]==target){
        //         return true;
        //     }
        // }
      while(start<end){
          int mid=(start+end)/2;
          if(nums[mid]==target) return true;
          if(nums[mid]<target){
              start =mid+1;
          }
          else{
              end=mid-1;
          }
      }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,0,1,1,1};
        int target=0;
        System.out.println(search(nums, 0));
    }
    
}
