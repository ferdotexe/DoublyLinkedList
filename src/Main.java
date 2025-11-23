//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: ");
        DoublyLinkList doublyLinkList = new DoublyLinkList(1);

        System.out.println("List:");
        doublyLinkList.printList();

        System.out.println("List after RemoveFirst method was called: ");

        doublyLinkList.removeFirst();
        doublyLinkList.printList();

        System.out.println("Adding values to the list: ");

        doublyLinkList.append(1);
        doublyLinkList.append(2);
        doublyLinkList.append(3);
        doublyLinkList.append(4);

        doublyLinkList.printList();

        System.out.println(" Testing removeFirst with the actual list ");
        System.out.println("Removed value: " + doublyLinkList.removeFirst().getValue());
        doublyLinkList.printList();

        System.out.println("-----------------------");
        doublyLinkList.printAll();















    }
}