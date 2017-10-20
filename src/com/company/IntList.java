package com.company;

/**
 * Created by andy on 18.10.2017.
 */
public class IntList {
    Item head;
    Item tail;

    public int getSize() {
        int count = 0;
        Item item = head;
        if (head == null) count = 0;
        else {
            while (item != null) {
                count++;
                item = item.next;
            }
        }
        return count;
    }

    public void addFirst(int i) {
        Item item = new Item();
        item.value = i;
        if (head == null) {
            head = item;
            tail = item;
        } else {
            item.next = head;
            head = item;
        }
    }

    public void addMidle(int i, int index) {
        Item item1 = new Item();
        item1.value = i;
        Item item = head;
        int count = 0;
        if (head == null) {
            head = item;
            tail = item;
            return;
        } else {
            while (item.next != null) {
                if (count != index) {
                    count++;
                    item1.next = item.next;
                    item.next = item1;
                    return;
                }
                item = item.next;
            }
        }
    }

    public void addLast(int i) {
        Item item = new Item();
        item.value = i;
        if (head == null) {
            head = item;
            tail = item;
            return;
        } else {
            tail.next = item;
            tail = item;
            return;
        }
    }

    public void printList() {
        Item item = head;
        if (head == null)
            System.out.println("Список не содержит элементов");
        else {
            System.out.print("Список содержит элементы: ");
            while (item != null) {
                System.out.print(item.value + " ");
                item = item.next;
            }
        }
    }

    public void remove(int index) {
        int count = 0;
        if (head == null)
            System.out.println("Список не содержит элементов");
        else if (head == tail) {
            head = null;
            tail = null;
        } else {
            count++;
            Item item = head;
            while (count != index) {
                count++;
                if (item.next == tail) {
                    tail = item;
                }
                count++;
                item = item.next;
            }
        }
    }

    public int get(int index) {
        Item item = head;
        int count = 0;
        if (index > getSize()) {
            System.out.println("Введенный индекс выходит за границы списка");
            return -1;
        } else if (head == null) {
            System.out.println("Список не содержит элементов");
            return -1;
        } else {
            count++;
            while (count < index) {
                count++;
                item = item.next;
            }
        }
        return item.value;
    }

    public static void main(String[] args) {
        IntList list = new IntList();
        list.addFirst(2);
        list.addLast(8);
        list.addLast(7);
        list.addMidle(5, 2);
        list.addMidle(13, 2);
        list.addMidle(19, 3);
        System.out.println("Запрашиваемый по индексу элемент списка: " + list.get(2));
        System.out.println("Размер списка: " + list.getSize());
        list.printList();
    }
}
