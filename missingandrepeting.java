import java.util.*;

// DSA Missig and repating element in array;

public class missingandrepeting {
    public static void main(String[] args) {
        int A[]={1,2,3,4,2,1};
        int max=A.length;
        HashMap<Integer ,Boolean>map=new HashMap<>();
        for( Integer i:A){
            if(map.get(i)==null){
                map.put(i,true);
            }else{
                System.out.printl("repeting "+ i);
            }
         }
         
        for(int j=1;j<=max;j++){
            if(map.get(j)==null){
                System.out.print("missing "+ j);
            }
        }
    }
}