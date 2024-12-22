/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Nguyen Dai
 */
public class main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(3);
        list.addLast(6);  
        list.addLast(5);
        list.addFirst(2);
        list.addFirst(1);
        
        list.printList();
    }
}
