/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_dsa_lecture;

import static cisneros_dsa_lecture.selectionSort.selectionSort;

/**
 *
 * @author User
 */
public class selection_test {
    
    public static void main(String[] args) {

        int[] numbers = {64, 25, 12, 22, 11};

        System.out.println("Before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        selectionSort(numbers);

        System.out.println("\n\nAfter sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
    

