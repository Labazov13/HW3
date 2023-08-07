package org.example;

import java.util.LinkedList;

public class Reversee {

    /**
     * Этот метод переворачивает односвязный список.
     *
     * @param head - заголовок списка.
     * @return - перевернутый список.
     */
    public static LinkedList<Integer> reverse(LinkedList<Integer> head) {

        // Создаем новый список.
        LinkedList<Integer> reversedList = new LinkedList<>();

        // Переходим по старому списку в обратном порядке.
        while (head != null) {

            // Добавляем элемент из старого списка в новый в начале.
            reversedList.addFirst(head.getValue());

            // Переходим к следующему элементу старого списка.
            head = head.getNext();
        }

        // Возвращаем перевернутый список.
        return reversedList;
    }
}

