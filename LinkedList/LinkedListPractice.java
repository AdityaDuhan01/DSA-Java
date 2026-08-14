public class Main1{
    static class Node{
        int data;
        Node next;
        Node( int data){
            this.data= data;
            this.next=null;
        }
    }
    private node head=null;

    public void insert(int data){
        Node newNode = new Node(data);
    if (head == null) {
            head = newNode;
            return;
        }
         Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
            temp.next = newNode;
        }
             System.out.println("null");
    }
        public static void main( String[]args){
                Main list = new Main();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        System.out.print("This is the list: ");
        list.display();
    }
        
}