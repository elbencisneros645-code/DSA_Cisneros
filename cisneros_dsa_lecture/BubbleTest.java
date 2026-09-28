/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_dsa_lecture;

/**
 *
 * @author User
 */
public class BubbleTest {
    
     public static void main(String[] args) {
       

    
        int[] numbers = {5, 3, 8, 4, 2, 1, 7, 6};

       
        BubbleSort bubbleSort = new BubbleSort(numbers);

       
        System.out.println("Before sorting:");
        bubbleSort.print();

        System.out.println("\n\nBubble Sort:");

       
        bubbleSort.sort();

       
        System.out.println("\nAfter sorting:");
        bubbleSort.print();
    }
}
