/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylist;

/**
 *
 * @author ekaterina
 */
public class ArrayList {
    
    public static void main(String[] args) throws EmptyElementException, IndexOutOfBoundException {
        
        Array<Integer> array1 = new Array<Integer>(10);
        
        for (int i = 0; i < 10; ++i) {
            array1.add(i);
            System.out.print(array1.array[i] + " ");
        }
        
        System.out.println();
        array1.delete(5);
        for (int i = 0; i < array1.array.length; ++i) {
            System.out.print(array1.array[i] + " ");
        }
        
        System.out.println();
        System.out.println(array1.pop());
        for (int i = 0; i < array1.array.length; ++i) {
            System.out.print(array1.array[i] + " ");
        }
        
        System.out.println();
        System.out.println((Integer) array1.get(3));

        System.out.println(array1.size());      
        
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 10; ++i) {
            linkedList.add(i);
        }
        
        Node current = linkedList.head;
        for (int i = 0; i < 10; ++i) {
            System.out.print(current.value + " ");
            current = current.next;  
        }
        
        System.out.println();
        linkedList.delete(5);
        
        current = linkedList.head;
        for (int i = 0; i < 9; ++i) {
            System.out.print(current.value + " ");
            current = current.next;  
        }
        
        System.out.println();
        System.out.println(linkedList.pop());        
        current = linkedList.head;
        for (int i = 0; i < 8; ++i) {
            System.out.print(current.value + " ");
            current = current.next;  
        }
        
        System.out.println(); 
        System.out.println(linkedList.get(3));
        
        System.out.println(linkedList.size());
        
        Object[] array2 = new Object[] {1,2,3,4,4,5,6,4,9,4};
        Array<Integer> array3 = new Array<Integer>(array2);
        
        System.out.println(array3.findFirst(4));
        
        array3.deleteAll(4);
        for (int i = 0; i < array3.array.length; ++i) {
            System.out.print(array3.array[i] + " ");
        }
        
    }
    
}
