public class DoublyLinkList {

    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
            length++;
        } else{
            Node temp = tail;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            length++;
        }



    }



    public Node getHead(){
        return head;
    }

    public void setHead(Node head){
        this.head = head;
    }

    public Node getTail(){
        return tail;
    }
    public void setTail( Node tail ){
        this.tail = tail;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll(){
        if(length == 0){
            System.out.println("Head: null");
            System.out.println("Tail: null");

        } else {
            System.out.println("head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("length: " + length);
        System.out.println("\n Doubly linked list: ");
        if(length ==0 ){
            System.out.println("Empty");
        } else{
            printList();
        }
    }




    public class Node{
        private int value;
        private Node prev;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getPrev(){
            return prev;
        }

        public void setPrev(Node prev){
            this.prev = prev;

        }

        public Node getNext(){
            return next;
        }

        public void  setNext(Node next){
             this.next = next;
        }
    }


}
