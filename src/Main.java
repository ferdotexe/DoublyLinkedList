//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main Class: ");

        DoublyLinkList doublyLinkList = new DoublyLinkList(1);

        System.out.println("List:");
        doublyLinkList.printList();

        doublyLinkList.prepend(2);



        System.out.println("List  prepending a value:");
        doublyLinkList.printList();

        doublyLinkList.prepend(3);



        System.out.println("List after adding the second prepended value:");
        doublyLinkList.printList();


        System.out.println("Emptying list for further tests");
        doublyLinkList.makeEmpty();
        System.out.println("----------------------");


        System.out.println("List after prepending a vlue to the empty list:");
        doublyLinkList.prepend(1);
        doublyLinkList.printList();













    }
}