//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: ");
        DoublyLinkList doublyLinkList = new DoublyLinkList(1);

        System.out.println("List:");
        doublyLinkList.printList();

        System.out.println("List after values were added: ");
        doublyLinkList.append(3);
        doublyLinkList.append(4);
        doublyLinkList.append(5);
        doublyLinkList.append(6);

        doublyLinkList.printList();

        System.out.println("Retriving a choosen  node by its index in the list  ");
        System.out.println(doublyLinkList.get(0).getValue());

        System.out.println("Retriving a second node by its index in the list  ");
        System.out.println(doublyLinkList.get(1).getValue());

        System.out.println("Retriving a third node by its index in the list  ");
        System.out.println(doublyLinkList.get(2).getValue());

















    }
}