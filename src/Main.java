//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Classe main: ");

        DoublyLinkList doublyLinkList = new DoublyLinkList(1);
        System.out.println("--------------BEGIN--------------");
        doublyLinkList.printList();
        doublyLinkList.append(2);
        System.out.println("--------------After append--------------");
        doublyLinkList.printList();
        doublyLinkList.removeLast();
        System.out.println("--------------After RemoveLast--------------");
        doublyLinkList.printList();
        doublyLinkList.append(3);
        System.out.println("--------------After append 2--------------");
        doublyLinkList.printList();
        doublyLinkList.removeLast();
        System.out.println("--------------After RemoveLast 2 --------------");
        doublyLinkList.printList();
        System.out.println("--------------END--------------");








    }
}