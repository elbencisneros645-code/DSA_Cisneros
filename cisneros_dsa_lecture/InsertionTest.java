/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cisneros_dsa_lecture;

/**
 *
 * @author User
 */
public class InsertionTest {
    
    public static void main(String[] args) {
        
        int [] numbers = {5,3,8,4,2,1,7,6};
        
        InsertionSort insertionSort = new  InsertionSort(numbers);
        
        System.out.println("Before sorting ");
        insertionSort.display();
        
        System.out.println("\nInsertion Sort ");
        
        insertionSort.sort();
        
        System.out.println("\n After sorting ");
        insertionSort.display();
        
    }
    
}
