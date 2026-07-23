import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d) 
    {
        this.data = d;
        this.next = null;
    }
}
class Main{
    Node first;
    void insert(int d)
    {
        Node n = new Node(d);
        if(first==null)
        {
            first = n;
            n.next = first;
        } else {
            Node temp = first;
            while(temp.next!= first)
            {
                temp = temp.next;
                n.next = first;
            }
        }
    }
    void playSongs(int k)
    {
        if(first==null)
        {
            System.out.print("Linked list is Empty");
            return;
         }
        Node temp = first;
        System.out.print("Songs played");
        for(int i=0;i<k;i++){
            System.out.print("temp songs");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no.of songs:");
        int d = obj.nextInt();
        Main m = new Main();
        System.out.print("Enter songs ID:");
        for(int i=0;i<k;i++){
            m.insert(obj.nextInt());
        }
        System.out.println("Enter number of songs to play:");
        int k = obj.nextInt();
        m.playSongs();
        
    }
}
