//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Classe main: ");
        DoublyLinkList doublyLinkList = new DoublyLinkList(1);
        doublyLinkList.append(2);
        doublyLinkList.printAll();

        System.out.println("-------------------------------------------");

        DoublyLinkList doublyLinkListEmpty = new DoublyLinkList(1);

        doublyLinkListEmpty.setLength(0);

        doublyLinkListEmpty.append(1);

        doublyLinkListEmpty.printAll();


    }
}