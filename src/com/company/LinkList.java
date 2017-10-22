package com.company;

/**
 * Created by andy on 22.10.2017.
 */
public class LinkList {
    Link first;

    //метод добавляет элемент на первую позицию
    void addFirst(int key, double dataD) {
        Link newLink = new Link(key, dataD);
        newLink.next = first;
        first = newLink;
    }

    Link deliteFirst() {
        Link temp = first;
        first = temp.next;
        return temp;
    }

    //метод отображает элементы списка
    void displayList() {
        Link newLink;
        newLink = first;
        System.out.print("Элементы списка: ");
        while (newLink != null) {
            newLink.displayLink();
            newLink = newLink.next;
        }
        System.out.println("");
    }

    boolean isEmpty() {
        return (first == null);
    }

    Link delite(int key){
        Link current = first;
        Link previous = first;
        while (current.key!=key){
            if(current.next == null){
                first = null;
                return null;
            }
            else {

            }
        }
        return current;
    }
    //  метод добавляет элемент в середину списка найдя элемент по значению и сдвигая его
//    void addIndex(int dataI, double dataD) {
//        Link temp = first;
//        Link newLink = new Link(dataI, dataD);
//        while (temp != null) {
//            if (newLink == next) {
//                newLink = temp
//            }
//            temp = temp.next;
//        }
//
//    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(23, 35.0);
        list.addFirst(5, 44.1);
        list.addFirst(65, 3.78);
        list.addFirst(87, 13.3);
        list.addFirst(9, 4.005);
        list.displayList();
        while (!list.isEmpty()) {
            Link linkDel = list.deliteFirst();
            System.out.println("Удален элемент: " + linkDel.key + " " + linkDel.dataD);
        }
    }
}
