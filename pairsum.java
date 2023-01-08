public class pairsum {

    static boolean ispairsum(int arr[], int n, int x){
        int i;
        for( i=0;i<arr.length;i++)
            if(arr[i]>arr[i-1])
                break;
                // small sum for the given;
                int l=(i+1)%n;
               
                // large sum for given;
                int r=i;
            

            while(l!=r){
                if(arr[l]+arr[r]==x)
                    return true;
                
                if(arr[l]+arr[r]<x)
                    l=(i+1)%n;
                else
                    r=(n+r-1)%n;
            }
                return false;

            }

        
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int x = 16;
        int n = arr.length;
        if(ispairsum(arr, n, x)){
        System.out.println("true");
         } else{}
        System.out.println("false");
    }
    }

