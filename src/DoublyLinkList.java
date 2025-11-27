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

    public void makeEmpty(){
        head = null;
        tail = null;
        length = 0;
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

    public Node removeLast(){
        Node temp = tail;
        if(length == 0){
            return null;
        } else if( length == 1) {
            head = null;
            tail = null;
            length--;
            return temp;
        } else{

            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
            length--;
            return temp;
        }
    }

    public Node removeFirst(){
        Node temp = head;
        if(length == 0) {
            return null;
        } else if( length == 1 ){
            head = null;
            tail = null;
            length--;
            return temp;
        } else{
            head = head.next;
            head.prev = null;
            temp.next = null;
            length--;
            return temp;
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
            System.out.print(temp.value + ", ");
            temp = temp.next;
        }
        System.out.println(); //breaking line
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

    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0 ){
            head = newNode;
            tail = newNode;
        } else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;

    }


    public Node get(int index){
        if(index < 0 || index >= length){
            return null;
        }

        Node temp = head;
        if(index < length/2){
            for(int i = 0; i < index; i++ ){
                temp = temp.next;
            }
        } else{
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);

        if(temp != null){
            temp.value = value;
            return true;
        } else{
            return false;
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
