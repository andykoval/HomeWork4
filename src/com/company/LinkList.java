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

    double findLinkInd(int index) {
        Link newLink = first;
        int count = 0;
        if (isEmpty())
            return 0;
        while (newLink != null) {
            if (count++ == index)
                return newLink.dataD;
            newLink = newLink.next;
        }
        return 0;
    }

    int size() {
        int count = 0;
        if (isEmpty())
            return 0;
        Link newLink = first;
        while (newLink != null) {
            count++;
            newLink = newLink.next;
        }
        return count;
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

    Link findLink(int key) {
        Link current = first;
        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                current = current.next;
            }
        }
        return current;
    }

    Link deliteLink(int key) {
        Link current = first;
        Link previous = first;
        while (current.key != key) {
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
            if (current == first)
                first = first.next;
            else {
                previous.next = current.next;
            }
        }
        return current;
    }
    double getLast(){
        Link newLink = first;
        int count = 0;
        if(isEmpty())
            return 0;
        while (count++!=(size()-1))
            newLink = newLink.next;
        return newLink.dataD;
    }


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
        list.addFirst(2, 13.0);
        list.addFirst(3, 5.13);
        list.addFirst(9, 0.78);
        list.addFirst(5, 13.3);
        list.addFirst(88, 9.25);
        list.displayList();
        list.deliteLink(5);
        list.displayList();
        Link linkF = list.findLink(9);
        System.out.println("Поиск элемента по ключу: " + "{" + linkF.key + " " + linkF.dataD + "}");
        System.out.println("Размер списка: " + list.size());
        System.out.println("Элемент по индексу: " + list.findLinkInd(3));
        System.out.println(list.getLast());
    }
}
