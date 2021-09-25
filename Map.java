import java.util.*;
class HashMap {
    public static void main(String[] args) {
         int a[]={12,14,8,18,25,10,11};
         int n=7;
        Node list[]=new Node[6];
         for(int i=0;i<n;i++){
             int hash=hash(a[i],7);
              if(list[hash]==null){
                  list[hash]=new Node(a[i],0,hash,null);
              }
              else {
                  Node temp=list[hash];
                  while(temp.next!=null){
                      temp=temp.next;
                  }
                  temp.next=new Node(a[i],0,hash,null);
              }
         }
        System.out.println(list[4].next.next.key); 
        // at index 4 there is list so to check it i have printed this line
        //  for(int i=0;i<list.length;i++){
        //      if(list[i]!=null)
        //      System.out.print(list[i].key+" ");
        //  }
         
    }
     static int hash(int k,int n){
         return k%n;
     }
   static class Node{
        int key;
        int val;
        int hash;
        Node next;
        Node(int key,int val,int hash,Node next){
            this.key=key;
            this.val=val;
            this.hash=hash;
            this.next=next;
        }
    }
}
