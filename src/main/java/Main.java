
import collections.lists.GbLinkedList;

public class Main {
    public static void main(String[] args) {

        GbLinkedList<Integer> linkList = new GbLinkedList<>();
        linkList.addLastElement(5);
        linkList.addLastElement(3);
        linkList.addLastElement(8);
        //-----------------------------
        linkList.addFirstElement(34);
        linkList.addFirstElement(76);
        linkList.addFirstElement(23);

        System.out.println(linkList);
    }
}