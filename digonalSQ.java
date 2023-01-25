import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class digonalSQ {

    static void subarrysum(int arr[]){
    HashMap<Integer,Boolean>set=new HashSet<>();
    for(int i=0;i<arr.length;i++){
         set.add(arr[i]);
      
      if(set.containsKey(arr[i])){
        map.put(i,ture);
        System.out.println(i);
      }
    }
System.out.println(set);
    }
            
    public static void main(String[] args) {
        int arr[]={1,1,1,0,0,0};
        int t=33;
        subarrysum(arr);
    }
    
}
