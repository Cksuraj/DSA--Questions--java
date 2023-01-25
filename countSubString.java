public class countSubString {
    static class Node{
        Node c[]=new Node[26];
        boolean eow;

        public Node(){
            for(int i=0;i<26;i++){
                c[i]=null;
            }
        }
    }
    
    static Node root=new Node();

    public static void insert(String S){
        int id=0;
        int st=S.length();
        Node curr=root;
        for(int i=0; i<st;i++){
            id=S.charAt(i)-'a';
            if(curr.c[id]==null){
                curr.c[id]=new Node();
            }
            curr=curr.c[id];
        }
        curr.eow=true;
    }
    
    public static boolean search(String key){
        int id=0;
        int st=key.length();
        Node curr=root;
        for(int i=0; i<st;i++){
            id=key.charAt(i)-'a';
            if(curr.c[id]==null){
                return false;
            }
            curr=curr.c[id];
        }
     return curr.eow==true;
    }
     
    public static int countnode(Node root){
        if(root == null){
            return 0;
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(root.c[i]!=null){
                count+=countnode(root.c[i]);
            }
        }
        return count+1;

    }
    public static void printnode(Node root){
        for(int i=0;i<root.c.length;i++){
            System.out.println(root.c[i]);
        }
    }

    public static int Rcount(String S , int i, int j , int n){
        if(n==1){
            return 1;
        }
        if(n<=0){
            return 0;
        }
        int result = Rcount(S, i +1, j , n-1)+Rcount(S, i, j-1, n-1)- Rcount(S, i+1, j-1, n-2);
        if(S.charAt(i)==S.charAt(j)){
            result++;
        }
        return result;
    }

    public static void main(String args[]) {
        String S="apple";
        for(int i=0; i<S.length();i++){
           String suffix =S.substring(i);
           insert(suffix);
        }
        int n=S.length();
        System.out.println(countnode(root));

       // System.out.println(Rcount(S, 0, n-1, n));
    }        
}
