public class doublylistinslast {
    Node head,tail;

    doublylistinslast(){
        head = tail = null;
    }
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public void create(int value){
        Node newnode = new Node(value);
        if(head==null){
            head = tail = newnode;
        }
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public void display(Node head){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while (head!=null) {
                System.out.println(head.data);
                head = head.next;
            }
        }
    }
    public void inslast(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
        }
        else{
            newnode.prev = tail;
            tail.next = newnode;
            tail = newnode;
        }
    }
    public static void main(String[] args){
        doublylistinslast list = new doublylistinslast();
        list.create(2);
        list.create(4);
        list.create(6);
        list.display(list.head);
        list.inslast(1);
        System.out.println();
        list.display(list.head);
        
    }
}
