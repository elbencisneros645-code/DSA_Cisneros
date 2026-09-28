/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_dsa_lecture;

import static cisneros_dsa_lecture.MergeSort.mergeSort;

/**
 *
 * @author User
 */
public class Mergetest {
    
    public static void main(String[] args) {

        int[] arr = {38, 12, 27, 43, 9, 31, 18, 25};

        System.out.println("Original Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nMerge Sort Iterations:");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("\nFinal Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
}
