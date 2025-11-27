//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: ");
        DoublyLinkList doublyLinkList = new DoublyLinkList(1);

        System.out.println("List:");
        doublyLinkList.printList();

        System.out.println("List after values were added: ");
        doublyLinkList.append(2);
        doublyLinkList.append(3);
        doublyLinkList.append(4);
        doublyLinkList.append(5);

        doublyLinkList.printList();

        System.out.println("Altering first index: ");
        doublyLinkList.set(0,2);
        System.out.println("List updated!");
        doublyLinkList.printList();

        System.out.println("Altering second index: ");
        doublyLinkList.set(1,3);
        System.out.println("List updated!");
        doublyLinkList.printList();

        System.out.println("Altering third index: ");
        doublyLinkList.set(2,4);
        System.out.println("List updated!");
        doublyLinkList.printList();
















    }
}